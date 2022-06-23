package com.example.myapplication.audio;

import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Message;
import android.text.format.DateFormat;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class AudioManager {

    private MediaRecorder mMediaRecorder;
    private String filePath;
    private Timer timer = null;
    private int value = 0;
    private int max = 0;
    private RecordVoicePopWindow mRecordVoicePopWindow;


    public String startRecord(String filePath, RecordVoicePopWindow mRecordVoicePopWindow) {
        this.mRecordVoicePopWindow = mRecordVoicePopWindow;
        this.filePath = filePath;
//        System.out.println("startRecord");
        // 开始录音
        /* ①Initial：实例化MediaRecorder对象 */
        if (mMediaRecorder == null)
            mMediaRecorder = new MediaRecorder();
        try {
            /* ②setAudioSource/setVedioSource */
            mMediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);// 设置麦克风
            /*
             * ②设置输出文件的格式：THREE_GPP/MPEG-4/RAW_AMR/Default THREE_GPP(3gp格式
             * ，H263视频/ARM音频编码)、MPEG-4、RAW_AMR(只支持音频且音频编码要求为AMR_NB)
             */
            mMediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
            /* ②设置音频文件的编码：AAC/AMR_NB/AMR_MB/Default 声音的（波形）的采样 */
            mMediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
            String fileName = DateFormat.format("yyyyMMdd_HHmmss", Calendar.getInstance(Locale.CHINA)) + ".m4a";
//            if (!FileUtils.isFolderExist(FileUtils.getFolderName(audioSaveDir))) {
//                FileUtils.makeFolders(audioSaveDir);
//            }
            filePath = filePath + '/' + fileName;
            /* ③准备 */
            mMediaRecorder.setOutputFile(filePath);
            mMediaRecorder.prepare();
            /* ④开始 */
            mMediaRecorder.start();
            starttorec();   //调用线程来实现获取当前音频振幅 （start to record）

        } catch (IllegalStateException | IOException e) {
//            System.out.println("call startAmr(File mRecAudioFile) failed!" + e.getMessage());
        }
        return filePath;
    }

    public void stopRecord() {
        timer.cancel();
        System.out.println("stopRecord");

        try {
            mMediaRecorder.stop();
            mMediaRecorder.release();
            mMediaRecorder = null;
            filePath = "";
        } catch (RuntimeException e) {
//            System.out.println(e.toString());
            mMediaRecorder.reset();
            mMediaRecorder.release();
            mMediaRecorder = null;

            File file = new File(filePath);
            if (file.exists())
                file.delete();

            filePath = "";
        }
    }

    private final Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            mRecordVoicePopWindow.updateCurrentVolume(msg.arg1);
            starttorec();         //重新调用检测的线程
        }
    };

    public void starttorec() {

        timer = new Timer();
        //设置线程抽象类中的run（），这里更新value的值
        //把value的值放到用于线程之间交流数据的Handler的message里
        //Handler类发出信息
        TimerTask task = new TimerTask() {             //设置线程抽象类中的run（），这里更新value的值
            @Override
            //把value的值放到用于线程之间交流数据的Handler的message里
            public void run() {
                if (mMediaRecorder == null){
                    return;
                }
                value = mMediaRecorder.getMaxAmplitude();
                Message message = mHandler.obtainMessage();
                message.arg1 = value;
                mHandler.sendMessage(message);//Handler类发出信息
            }

        };
        timer.schedule(task, 100);     //timer，设置为100毫秒后执行task线程（会自动调用task的start（）函数）
        //timer是计时器，作用就是在设定时间后启动规定的线程。这用来限制
        //getMaxAmplitude（）的调用频率，减少资源的使用（时间调太短，也会闪退）              //
    }


}
