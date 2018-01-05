package cn.bingoogolapple.progressbar.demo

import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import java.lang.ref.WeakReference

class MainActivity : AppCompatActivity() {
    private val mHandler: UpdateProgressHandler = UpdateProgressHandler(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mHandler.sendEmptyMessageDelayed(WHAT_UPDATE, 400)
    }

    override fun onDestroy() {
        mHandler.removeMessages(WHAT_UPDATE)
        super.onDestroy()
    }

    private fun updateProgress() {
        var progress = pb_main_demo1.progress
        progress++
        if (progress < pb_main_demo1.max) {
            mHandler.sendEmptyMessageDelayed(WHAT_UPDATE, 100)
        } else if (progress == pb_main_demo1.max) {
            mHandler.sendEmptyMessageDelayed(WHAT_UPDATE, 2000)
        } else {
            progress = 0
            mHandler.sendEmptyMessageDelayed(WHAT_UPDATE, 100)
        }

        pb_main_demo1.progress = progress
        pb_main_demo2.progress = progress
        pb_main_demo3.progress = progress
        pb_main_demo4.progress = progress
        pb_main_demo5.progress = progress
        pb_main_demo6.progress = progress
        pb_main_demo7.progress = progress
    }

    /**
     * 查看系统自带 ProgressBar 支持的样式
     */
    fun jumpToDefault(v: View) {
        startActivity<DefaultActivity>()
    }

    companion object {
        private val WHAT_UPDATE = 1
    }

    private static class UpdateProgressHandler(activity: MainActivity) : Handler() {
        private val mActivity: WeakReference<MainActivity> = WeakReference<MainActivity>(activity)

        override fun handleMessage(msg: Message) {
            val activity = mActivity.get()
            activity?.apply {
                updateProgress()
            }
        }
    }
}
