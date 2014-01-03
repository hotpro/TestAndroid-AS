package me.yutao.testandroid.testevent.passthrough;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;

import me.yutao.testandroid.R;
import me.yutao.testandroid.testevent.Tool;

public class EventPassThoughActivity extends Activity implements OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_event_pass_through);
//        View v = findViewById(R.id.tvFront);
//        v.setOnClickListener(this);
//        
//        View v = findViewById(R.id.tvEvent);
//        v.setFocusable(true);
//        
//        ViewGroup parent = (ViewGroup) v.getParent();
//        parent.setFocusable(true);
        
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