package cn.bingoogolapple.progressbar.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ProgressBar;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {
    private static final int WHAT_UPDATE = 1;

    private ProgressBar mPbMainDemo1;
    private ProgressBar mPbMainDemo2;
    private ProgressBar mPbMainDemo3;
    private ProgressBar mPbMainDemo4;
    private ProgressBar mPbMainDemo5;
    private ProgressBar mPbMainDemo6;
    private ProgressBar mPbMainDemo7;

    private final UpdateProgressHandler mHandler = new UpdateProgressHandler(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPbMainDemo1 = findViewById(R.id.pb_main_demo1);
        mPbMainDemo2 = findViewById(R.id.pb_main_demo2);
        mPbMainDemo3 = findViewById(R.id.pb_main_demo3);
        mPbMainDemo4 = findViewById(R.id.pb_main_demo4);
        mPbMainDemo5 = findViewById(R.id.pb_main_demo5);
        mPbMainDemo6 = findViewById(R.id.pb_main_demo6);
        mPbMainDemo7 = findViewById(R.id.pb_main_demo7);

        mPbMainDemo1.setMax(100);
        mPbMainDemo2.setMax(100);
        mPbMainDemo3.setMax(100);
        mPbMainDemo4.setMax(100);
        mPbMainDemo5.setMax(100);
        mPbMainDemo6.setMax(100);
        mPbMainDemo7.setMax(100);

        mHandler.sendEmptyMessageDelayed(WHAT_UPDATE, 400);
    }

    @Override
    protected void onDestroy() {
        mHandler.removeMessages(WHAT_UPDATE);
        super.onDestroy();
    }

    private void updateProgress() {
        int progress = mPbMainDemo1.getProgress();
        progress++;
        if (progress < mPbMainDemo1.getMax()) {
            mHandler.sendEmptyMessageDelayed(WHAT_UPDATE, 100);
        } else if (progress == mPbMainDemo1.getMax()) {
            mHandler.sendEmptyMessageDelayed(WHAT_UPDATE, 2000);
        } else {
            progress = 0;
            mHandler.sendEmptyMessageDelayed(WHAT_UPDATE, 100);
        }

        mPbMainDemo1.setProgress(progress);
        mPbMainDemo2.setProgress(progress);
        mPbMainDemo3.setProgress(progress);
        mPbMainDemo4.setProgress(progress);
        mPbMainDemo5.setProgress(progress);
        mPbMainDemo6.setProgress(progress);
        mPbMainDemo7.setProgress(progress);
    }

    public void jumpToDefault(android.view.View v) {
        startActivity(new Intent(this, DefaultActivity.class));
    }

    private static class UpdateProgressHandler extends Handler {
        private final WeakReference<MainActivity> mActivity;

        UpdateProgressHandler(MainActivity activity) {
            mActivity = new WeakReference<>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            MainActivity activity = mActivity.get();
            if (activity != null) {
                activity.updateProgress();
            }
        }
    }
}
