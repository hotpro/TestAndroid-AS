package me.yutao.testandroid.testevent;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created with Android Studio
 * User: Chris.Hou
 * Date: 3/17/14
 */
public class BaseActivity extends Activity implements View.OnClickListener {
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        System.out.println("Activity:dispatchTouchEvent.action=" + Tool.getTouchAction(ev.getAction()) + " begin");
        boolean r = super.dispatchTouchEvent(ev);
        System.out.println("Activity:dispatchTouchEvent.action=" + Tool.getTouchAction(ev.getAction())+ " r: " + r + " end");
        return r;
    }

    @Override
    public void onUserInteraction() {
//        System.out.println("Activity:onUserInteraction begin");
        super.onUserInteraction();
//        System.out.println("Activity:onUserInteraction end");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        System.out.println("Activity:onTouchEvent::action=" + Tool.getTouchAction(event.getAction()));
        boolean r = super.onTouchEvent(event);
        System.out.println("Activity:onTouchEvent::action=" + Tool.getTouchAction(event.getAction()) + " r: " + r + " end");
        return r;

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

    }
}
