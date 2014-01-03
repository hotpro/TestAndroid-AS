package me.yutao.testandroid.testevent.VerticalHorizontalIssue;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/**
 * Created with Android Studio
 * User: Chris.Hou
 * Date: 1/3/14
 */
public class MyHorizontalScrollView extends HorizontalScrollView{
    public MyHorizontalScrollView(Context context) {
        super(context);
    }

    public MyHorizontalScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyHorizontalScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
