package com.example.myapplication.audio;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.myapplication.R;


public class RecordVoicePopWindow extends PopupWindow {

    TextView mTvRcStatus;
    ImageView mIvRcStatus;
    ImageView mIvRcVolume;
    TextView mTvRcTime;

    public RecordVoicePopWindow(Context context) {
        super(context);
//        System.out.println("&%$%^&");
        View mContentView = LayoutInflater.from(context).inflate(R.layout.community_pop_record_voice, null);
        setContentView(mContentView);
        mTvRcStatus = mContentView.findViewById(R.id.tv_rc_status);
        mIvRcStatus = mContentView.findViewById(R.id.iv_rc_status);
        mIvRcVolume = mContentView.findViewById(R.id.iv_rc_volume);
        mTvRcTime = mContentView.findViewById(R.id.tv_rc_time);
        // 设置SelectPicPopupWindow弹出窗体的宽
        setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        // 设置SelectPicPopupWindow弹出窗体的高
        setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
        // 设置SelectPicPopupWindow弹出窗体可点击
        setFocusable(true);
        setOutsideTouchable(false);
        setTouchable(false);
        // 实例化一个ColorDrawable颜色为半透明
        ColorDrawable dw = new ColorDrawable(0x00000000);
        // 设置SelectPicPopupWindow弹出窗体的背景
        setBackgroundDrawable(dw);
    }

    /**
     * 正常录制
     */
    public void showRecordingTipView() {
//        System.out.println("show");
        mIvRcStatus.setVisibility(View.VISIBLE);
        mIvRcVolume.setVisibility(View.VISIBLE);
        mIvRcStatus.setImageResource(R.mipmap.community_record_volume_microphone);
        mTvRcStatus.setVisibility(View.VISIBLE);
        mTvRcStatus.setText(R.string.community_chat_list_remove_above_cancel_send);
        mTvRcTime.setVisibility(View.GONE);
    }

    /**
     * 更新当前音量大小
     */
    public void updateCurrentVolume(int decibel) {
        switch (decibel * 6 / 10000) {
            case 0:
            case 1:
                mIvRcVolume.setImageResource(R.mipmap.community_record_volume_01);
                break;
            case 2:
                mIvRcVolume.setImageResource(R.mipmap.community_record_volume_02);
                break;
            case 3:
                mIvRcVolume.setImageResource(R.mipmap.community_record_volume_03);
                break;
            case 4:
                mIvRcVolume.setImageResource(R.mipmap.community_record_volume_04);
                break;
            case 5:
                mIvRcVolume.setImageResource(R.mipmap.community_record_volume_05);
                break;
            default:
                mIvRcVolume.setImageResource(R.mipmap.community_record_volume_06);
        }
    }
}