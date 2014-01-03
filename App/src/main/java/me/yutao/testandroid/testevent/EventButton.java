package me.yutao.testandroid.testevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Button;

public class EventButton extends Button {
	private String tag = EventButton.class.getSimpleName();

	public EventButton(Context context) {
		super(context);
	}

	public EventButton(Context context, AttributeSet attrs) {
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
	public boolean onTouchEvent(MotionEvent event) {
		System.out.println(tag+ " onTouchEvent.action=" + Tool.getTouchAction(event.getAction()) + " begin");
		boolean r = super.onTouchEvent(event);
//		r = false;
		System.out.println(tag+ " onTouchEvent.action=" + Tool.getTouchAction(event.getAction())+ " r: " + r + " end");
		return r;
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		System.out.println("LinearLayout.onKeyDown.key=" + keyCode);
		return super.onKeyDown(keyCode, event);
	}
	
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		System.out.println("LinearLayout.onKeyUp.key=" + keyCode);
		return super.onKeyUp(keyCode, event);
	}
}
