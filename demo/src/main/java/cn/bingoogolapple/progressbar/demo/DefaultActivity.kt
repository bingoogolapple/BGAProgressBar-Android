package cn.bingoogolapple.progressbar.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class DefaultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_default)
        title = "系统自带 ProgressBar 支持的样式"
    }
}
