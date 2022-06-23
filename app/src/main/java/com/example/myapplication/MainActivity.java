package com.example.myapplication;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.audio.AudioManager;
import com.example.myapplication.audio.RecordVoicePopWindow;
import com.example.myapplication.databinding.ActivityMainBinding;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private Activity activity;
    private ActivityMainBinding binding;
    private AppBarConfiguration appBarConfiguration;
    private AudioManager audioManager;
    private Context context;
    private RecordVoicePopWindow recordVoicePopWindow;
    private String fileName;
    private TextView textView;
    private TextView textView2;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkPermission();


        context = this;
        audioManager = new AudioManager();
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(
                this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(
                navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(
                this, navController, appBarConfiguration);

        binding.fab.setOnTouchListener((v, event) -> {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN: {
                    Message message1 = mHandler2.obtainMessage();
                    message1.obj = ("我在听");
                    mHandler2.sendMessage(message1);
                    activity = new Activity();
                    if (recordVoicePopWindow == null) {
                        recordVoicePopWindow = new RecordVoicePopWindow(context);
                    }
                    recordVoicePopWindow.showAsDropDown(v, 0, 0);
                    recordVoicePopWindow.showRecordingTipView();
                    //按住事件发生后执行代码的区域
                    fileName = audioManager.startRecord(
                            getExternalCacheDir().getPath(), recordVoicePopWindow);
//                    System.out.println("按住了");
                    break;
                }
                case MotionEvent.ACTION_MOVE: {
                    //移动事件发生后执行代码的区域
//                    System.out.println("在移动");
                    break;
                }
                case MotionEvent.ACTION_UP: {
                    if (recordVoicePopWindow != null) {
                        recordVoicePopWindow.dismiss();
                    }
                    //松开事件发生后执行代码的区域
                    audioManager.stopRecord();
                    //进行语音识别
                    new Thread() {
                        @Override
                        public void run() {
                            //成了，好耶
                            String res = null;
                            try {
                                res = VoiceRecognition.encodeBase64File(fileName);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
//                            String res = "设置17点08分的闹钟";
                            Message message = mHandler.obtainMessage();
                            message.obj = res;
                            mHandler.sendMessage(message);//Handler类发出信息
                            if (res == null) {
                                return;
                            }
                            // 执行任务
                            try {
                                Message message1 = mHandler2.obtainMessage();
                                message1.obj = activity.test(context, res);;
                                mHandler2.sendMessage(message1);
//                                System.out.println("删除文件" + fileName);
                                File file = new File(fileName);
                                file.delete();
//                                System.out.println("删了");
                            } catch (Exception e) {
                                e.printStackTrace();
                                Message message1 = mHandler2.obtainMessage();
                                message1.obj = e.getMessage();
                                mHandler2.sendMessage(message1);
                            }
                        }
                    }.start();
                    break;
                }
                default:
                    break;
            }
            return false;
        });
//        binding.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("test12345");
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
////                startRecord();
//            }
//        });

//        mContentView = LayoutInflater.from(mContext).inflate(R.layout.fragment_first, null);
        textView = findViewById(R.id.textview_first);
        textView2 = findViewById(R.id.textview_first2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(
                this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    /**
     * 权限申请
     */
    private void checkPermission() {
        String[] permissions = new String[]{
                Manifest.permission.RECORD_AUDIO,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        };
        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(
                    this, permission) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(
                        this, permissions, 200);
                return;
            }
        }
    }


    @Override
    public void onRequestPermissionsResult(
            int requestCode, @NonNull String[] permissions,
            @NonNull int[] grantResults
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 200) {
            for (int i = 0; i < permissions.length; i++) {
                if (grantResults[i] != PackageManager.PERMISSION_GRANTED) {
                    Intent intent = new Intent();
                    intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                    Uri uri = Uri.fromParts(
                            "package", getPackageName(), null);
                    intent.setData(uri);
                    startActivityForResult(intent, 200);
                    return;
                }
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 200) {
            checkPermission();
        }
    }

    private final Handler mHandler = new Handler() {
        @SuppressLint("HandlerLeak")
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String s = msg.obj.toString();
//            System.out.println(s);
            textView.setText(s);
        }
    };

    private final Handler mHandler2 = new Handler() {
        @SuppressLint("HandlerLeak")
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String s = msg.obj.toString();
//            System.out.println(s);
            textView2.setText(s);
        }
    };
}