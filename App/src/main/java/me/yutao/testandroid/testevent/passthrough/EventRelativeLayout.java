package me.yutao.testandroid.testevent.passthrough;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import me.yutao.testandroid.testevent.Tool;
import me.yutao.testandroid.testevent.Utils;

public class EventRelativeLayout extends RelativeLayout {
	private String tag = EventRelativeLayout.class.getSimpleName();
	public EventRelativeLayout(Context context) {
		super(context);
    }

	public EventRelativeLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
        tag = Utils.getTag(getTag());
	}

	public EventRelativeLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
    	System.out.println(tag+ " dispatchTouchEvent.action=" + Tool.getTouchAction(ev.getAction()) + " begin");
    	boolean r = super.dispatchTouchEvent(ev);
        r = Utils.isDispatchTouchEvent(getTag(), r);
        System.out.println(tag+ " dispatchTouchEvent.action=" + Tool.getTouchAction(ev.getAction())+ " r: " + r + " end");
        return r;
    }

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		System.out.println(tag+ " onInterceptTouchEvent.action=" + Tool.getTouchAction(ev.getAction()) + " begin");
		boolean r = super.onInterceptHoverEvent(ev);
        r = Utils.isInterceptTouchEvent(getTag(), r);
		System.out.println(tag+ " onInterceptTouchEvent.action=" + Tool.getTouchAction(ev.getAction())+ " r: " + r + " end");
		return r;
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		System.out.println(tag+ " onTouchEvent.action=" + Tool.getTouchAction(event.getAction()) + " begin");
		boolean r = super.onTouchEvent(event);
        r = Utils.isTouchEvent(getTag(), r);
		System.out.println(tag+ " onTouchEvent.action=" + Tool.getTouchAction(event.getAction())+ " r: " + r + " end");
		return r;
//		return true;
	}
}
