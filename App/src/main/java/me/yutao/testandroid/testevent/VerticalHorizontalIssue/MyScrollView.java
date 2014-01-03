package me.yutao.testandroid.testevent.VerticalHorizontalIssue;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created with Android Studio
 * User: Chris.Hou
 * Date: 1/3/14
 */
public class MyScrollView extends ScrollView{

    public MyScrollView(Context context) {
        super(context);
    }

    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


}
