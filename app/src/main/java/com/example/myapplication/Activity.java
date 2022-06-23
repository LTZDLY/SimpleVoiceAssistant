package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.AlarmClock;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Activity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    public String test(Context context, String msg) throws Exception {
//        System.out.println("here");
        if (msg.startsWith("你好")){
            fun();
            return "切噜~♪";
        }
        if (msg.startsWith("打开") || msg.startsWith("启动")) {
            //启动app
            //成功，好耶
            return getAppInfo(context, msg);
        }
        if (msg.startsWith("设置闹钟")) {
            //设置闹钟
            //成功，好耶
            return setAlarm(context, msg);
        }
        if (msg.startsWith("打电话") || msg.startsWith("拨号")) {
            // 打电话
            // 成了好耶
            return callUp(context, msg);
        }
        String pattern_phone = "(\\D*)(\\d+)(打电话|拨号.*)";
        Pattern r_phone = Pattern.compile(pattern_phone);
        Matcher m_phone = r_phone.matcher(msg);
        if (m_phone.find()) {
            return callUp(context, msg);
        }
        String pattern_alarm = "(.*设置)(.+)(的闹钟.*)";
        Pattern r_alarm = Pattern.compile(pattern_alarm);
        Matcher m_alarm = r_alarm.matcher(msg);
        if (m_alarm.find()) {
            return setAlarm(context, msg);
        }
        return "暂时不支持这个功能噜~";

    }

    private String getAppInfo(Context context, String msg) throws Exception {
        String pattern_app = "(.*打开|.*启动)(.+)(。|.|,|，|？|\\?|!|！)";
        Pattern r_app = Pattern.compile(pattern_app);
        Matcher m_app = r_app.matcher(msg);
        String name;
        if (m_app.find()) {
            name = m_app.group(2);
        }else return "走神了，麻烦再说一遍捏";
        PackageManager packageManager = context.getPackageManager();
        //获取所有安装的app
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
        for (PackageInfo info : installedPackages) {
            String packageName = info.packageName;//app包名
            ApplicationInfo ai = packageManager.getApplicationInfo(packageName, 0);
            String appName = (String) packageManager.getApplicationLabel(ai);//获取应用名称
//            System.out.println(packageName + ':' + appName);
            if (Objects.equals(name, appName)) {
                return openApp(context, packageName);
            }
        }
        return "好像没有叫" + name + "的应用捏，咱们去安装一个吧";
    }

    private String openApp(Context context, String packageName) {
//        System.out.println(packageName);
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(packageName);
        intent.setFlags(
                Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
        context.startActivity(intent);
        return "好的";
    }

    private String setAlarm(Context context, String msg) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        intent.putExtra(AlarmClock.EXTRA_MESSAGE, "设置闹钟");


        String pattern_hour = "(\\D*)(\\d+)(点|时|:|：)";
        Pattern r_hour = Pattern.compile(pattern_hour);
        Matcher m_hour = r_hour.matcher(msg);
        int hour;
        if (m_hour.find()) {
            hour = Integer.parseInt(Objects.requireNonNull(m_hour.group(2)));
        } else {
            return ("没听清，再说一遍捏");
        }
        if (hour == 24)
            hour = 0;
        if (hour > 24 || hour < 0)
            return("你想定几点的捏");
        if (msg.contains("凌晨") || msg.contains("清晨") || msg.contains("晚上"))
            if (hour == 12)
                hour = 0;
        if (msg.contains("凌晨") || msg.contains("清晨") || msg.contains("早晨") ||
                msg.contains("早上") || msg.contains("上午"))
            if (hour > 12)
                return ("早上几点捏");
        if (msg.contains("下午") || msg.contains("傍晚") || msg.contains("晚上"))
            if (hour < 12)
                hour += 12;
        if (msg.contains("中午")) {
            if (hour < 6)
                hour += 12;
            else if (hour > 12)
                return ("中午几点捏");
        }

        String pattern_minute = "(\\D*)(点|时|:|：)(半|\\d+)(分?.*)";
        Pattern r_minute = Pattern.compile(pattern_minute);
        Matcher m_minute = r_minute.matcher(msg);
        int minute = 0;
        if (m_minute.find()) {
            String s = Objects.requireNonNull(m_minute.group(3));
            if (s.equals("半")) {
                minute = 30;
            } else minute = Integer.parseInt(s);
        }

        intent.putExtra(AlarmClock.EXTRA_HOUR, hour);
        intent.putExtra(AlarmClock.EXTRA_MINUTES, minute);
        intent.putExtra(AlarmClock.EXTRA_SKIP_UI, false);
        intent.putExtra(AlarmClock.EXTRA_VIBRATE, true);
        try {
//                Intent dialIntent =  new Intent(AlarmClock.ACTION_SHOW_ALARMS);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "好的";
    }

    private String callUp(Context context, String msg) {
        String pattern_phone = "(\\D*)(\\d+)(\\D*)";
        Pattern r_phone = Pattern.compile(pattern_phone);
        Matcher m_phone = r_phone.matcher(msg);
        if (m_phone.find()) {
            String number = m_phone.group(2);
            Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));//跳转到拨号界面，同时传递电话号码
            context.startActivity(dialIntent);
        }
        return "好的";
    }

    private void fun() throws IOException {
        if (mMediaPlayer == null){
            // 新建
            mMediaPlayer = new MediaPlayer();
        }else{
            mMediaPlayer.stop();
            mMediaPlayer.release();
            mMediaPlayer=new MediaPlayer();
        }
        String[] s = {"vo_btl_110901_attack_002", "vo_btl_110901_damage_002", "vo_btl_110901_nextwave",
        "vo_btl_110901_ub_200","vo_btl_110901_ub_300","vo_btl_110901_ub_400","vo_btl_110901_win_001",
        "vo_btl_116301_attack_001","vo_btl_116301_skill_100","vo_btl_116301_skill_200","vo_btl_116301_thanks"};
        int rnd = new Random().nextInt(s.length);
        String f = s[rnd] + ".m4a";
//        System.out.println(f);
        mMediaPlayer.setDataSource("https://shinoai.com/file/source/audio/" + f);
        mMediaPlayer.prepare();
        //说话
//        System.out.println("说话");
        mMediaPlayer.setVolume(1.0f, 1.0f);
        mMediaPlayer.start();
    }
}
