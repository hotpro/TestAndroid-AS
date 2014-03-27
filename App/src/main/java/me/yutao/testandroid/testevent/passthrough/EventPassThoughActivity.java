package me.yutao.testandroid.testevent.passthrough;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;

import me.yutao.testandroid.R;
import me.yutao.testandroid.testevent.BaseActivity;
import me.yutao.testandroid.testevent.Tool;

public class EventPassThoughActivity extends BaseActivity implements OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_event_pass_through);
    }

}