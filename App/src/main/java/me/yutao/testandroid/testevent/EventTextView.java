package me.yutao.testandroid.testevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

public class EventTextView extends TextView {
	private String tag = EventLinearLayout.class.getSimpleName();

	public EventTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		Object t = getTag();
		if (t instanceof String) {
			tag = (String) t;
		}
	}

	public EventTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public EventTextView(Context context) {
		super(context);
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
//		r = true;
		System.out.println(tag+ " onTouchEvent.action=" + Tool.getTouchAction(event.getAction())+ " r: " + r + " end");
		return r;
	}
	
	
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		System.out.println(tag+ " action=" + keyCode);
		return super.onKeyDown(keyCode, event);
	}
	
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		System.out.println(tag+ " action=" + keyCode);
		return super.onKeyUp(keyCode, event);
	}
}
