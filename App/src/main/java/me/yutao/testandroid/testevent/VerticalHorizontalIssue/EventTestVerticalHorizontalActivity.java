package me.yutao.testandroid.testevent.VerticalHorizontalIssue;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;

import me.yutao.testandroid.R;
import me.yutao.testandroid.testevent.Tool;

public class EventTestVerticalHorizontalActivity extends Activity implements OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_event_vertical_horizontal);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        System.out.println("Activity:dispatchTouchEvent.action=" + Tool.getTouchAction(ev.getAction()) + " begin");
        boolean r = super.dispatchTouchEvent(ev);
        System.out.println("Activity:dispatchTouchEvent.action=" + Tool.getTouchAction(ev.getAction())+ " r: " + r + " end");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public void onUserInteraction() {
        System.out.println("Activity:onUserInteraction begin");
        super.onUserInteraction();
        System.out.println("Activity:onUserInteraction end");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
    	System.out.println("Activity:onTouchEvent::action=" + Tool.getTouchAction(event.getAction()));
    	return super.onTouchEvent(event);
    }
    
    @Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		System.out.println("Activity::onKeyDown::key=" + keyCode);
		return super.onKeyDown(keyCode, event);
	}
    
    @Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		System.out.println("Activity::onKeyUp::key=" + keyCode);
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}