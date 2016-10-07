package cn.bingoogolapple.progressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:16/10/7 上午10:39
 * 描述:
 */
public class BGAProgressBar extends ProgressBar {
    private static final String TAG = BGAProgressBar.class.getSimpleName();

    private Style mStyle;

    public BGAProgressBar(Context context) {
        this(context, null);
    }

    public BGAProgressBar(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.progressBarStyle);
    }

    public BGAProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initDefaultAttrs(context);
        initCustomAttrs(context, attrs);
    }

    private void initDefaultAttrs(Context context) {
        mStyle = Style.Horizontal;

    }

    private void initCustomAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.BGAProgressBar);
        final int N = typedArray.getIndexCount();
        for (int i = 0; i < N; i++) {
            initAttr(typedArray.getIndex(i), typedArray);
        }
        typedArray.recycle();
    }

    protected void initAttr(int attr, TypedArray typedArray) {
        if (attr == R.styleable.BGAProgressBar_bga_pb_style) {
            int ordinal = typedArray.getInt(attr, Style.Horizontal.ordinal());
            mStyle = Style.values()[ordinal];
        }
    }

    @Override
    protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        if (mStyle == Style.Horizontal) {
            Log.i(TAG, "横向");
        } else if (mStyle == Style.Circle) {
            Log.i(TAG, "圆");
        }
    }

    private enum Style {
        Horizontal,
        Circle
    }
}
