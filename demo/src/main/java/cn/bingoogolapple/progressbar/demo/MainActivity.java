package cn.bingoogolapple.progressbar.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.bingoogolapple.progressbar.BGAProgressBar;

public class MainActivity extends AppCompatActivity {
    private static final int WHAT_UPDATE = 1;
    private BGAProgressBar mDemo1Pb;
    private BGAProgressBar mDemo2Pb;
    private BGAProgressBar mDemo3Pb;
    private BGAProgressBar mDemo4Pb;
    private BGAProgressBar mDemo5Pb;
    private BGAProgressBar mDemo6Pb;
    private BGAProgressBar mDemo7Pb;

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            int progress = mDemo1Pb.getProgress();
            progress++;
            if (progress < mDemo1Pb.getMax()) {
                sendEmptyMessageDelayed(WHAT_UPDATE, 100);
            } else if (progress == mDemo1Pb.getMax()) {
                sendEmptyMessageDelayed(WHAT_UPDATE, 2000);
            } else {
                progress = 0;
                sendEmptyMessageDelayed(WHAT_UPDATE, 100);
            }

            mDemo1Pb.setProgress(progress);
            mDemo2Pb.setProgress(progress);
            mDemo3Pb.setProgress(progress);
            mDemo4Pb.setProgress(progress);
            mDemo5Pb.setProgress(progress);
            mDemo6Pb.setProgress(progress);
            mDemo7Pb.setProgress(progress);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDemo1Pb = (BGAProgressBar) findViewById(R.id.pb_main_demo1);
        mDemo2Pb = (BGAProgressBar) findViewById(R.id.pb_main_demo2);
        mDemo3Pb = (BGAProgressBar) findViewById(R.id.pb_main_demo3);
        mDemo4Pb = (BGAProgressBar) findViewById(R.id.pb_main_demo4);
        mDemo5Pb = (BGAProgressBar) findViewById(R.id.pb_main_demo5);
        mDemo6Pb = (BGAProgressBar) findViewById(R.id.pb_main_demo6);
        mDemo7Pb = (BGAProgressBar) findViewById(R.id.pb_main_demo7);

        mHandler.sendEmptyMessageDelayed(WHAT_UPDATE, 400);
    }

    /**
     * 查看系统自带 ProgressBar 支持的样式
     *
     * @param v
     */
    public void jumpToDefault(View v) {
        startActivity(new Intent(this, DefaultActivity.class));
    }
}
