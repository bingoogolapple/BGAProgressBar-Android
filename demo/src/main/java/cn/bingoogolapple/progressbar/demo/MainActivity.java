package cn.bingoogolapple.progressbar.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
