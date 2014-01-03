package me.yutao.testandroid.testevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class EventRelativeLayout extends RelativeLayout {
	private String tag = EventRelativeLayout.class.getSimpleName();
	public EventRelativeLayout(Context context) {
		super(context);
	}

	public EventRelativeLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		Object t = getTag();
		if (t instanceof String) {
			tag = (String) t;
		}
	}

	public EventRelativeLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
    	System.out.println(tag+ " dispatchTouchEvent.action=" + Tool.getTouchAction(ev.getAction()) + " begin");
    	boolean r = super.dispatchTouchEvent(ev);
    	System.out.println(tag+ " dispatchTouchEvent.action=" + Tool.getTouchAction(ev.getAction())+ " r: " + r + " end");
        return r;
    }

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		System.out.println(tag+ " onInterceptTouchEvent.action=" + Tool.getTouchAction(ev.getAction()) + " begin");
		boolean r = super.onInterceptHoverEvent(ev);
		System.out.println(tag+ " onInterceptTouchEvent.action=" + Tool.getTouchAction(ev.getAction())+ " r: " + r + " end");
		return r;
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		System.out.println(tag+ " onTouchEvent.action=" + Tool.getTouchAction(event.getAction()) + " begin");
		boolean r = super.onTouchEvent(event);
		System.out.println(tag+ " onTouchEvent.action=" + Tool.getTouchAction(event.getAction())+ " r: " + r + " end");
		return r;
//		return true;
	}
}
