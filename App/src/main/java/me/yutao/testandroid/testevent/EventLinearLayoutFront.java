package me.yutao.testandroid.testevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class EventLinearLayoutFront extends LinearLayout {
	private String tag = EventLinearLayoutFront.class.getSimpleName();

	public EventLinearLayoutFront(Context context) {
		super(context);
	}

	public EventLinearLayoutFront(Context context, AttributeSet attrs) {
		super(context, attrs);
		Object t = getTag();
		if (t instanceof String) {
			tag = (String) t;
		}
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
//        r = true;
		System.out.println(tag+ " onInterceptTouchEvent.action=" + Tool.getTouchAction(ev.getAction())+ " r: " + r + " end");
		return r;
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		System.out.println(tag+ " onTouchEvent.action=" + Tool.getTouchAction(event.getAction()) + " begin");
		boolean r = super.onTouchEvent(event);
        r = true;
		System.out.println(tag+ " onTouchEvent.action=" + Tool.getTouchAction(event.getAction())+ " r: " + r + " end");
		return r;
//		return true;
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		System.out.println("LinearLayout.onKeyDown.key=" + keyCode);
		return super.onKeyDown(keyCode, event);
//		return true;
	}
	
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		System.out.println("LinearLayout.onKeyUp.key=" + keyCode);
		return super.onKeyUp(keyCode, event);
	}
}
