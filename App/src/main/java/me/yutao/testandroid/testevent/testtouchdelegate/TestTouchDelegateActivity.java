package me.yutao.testandroid.testevent.testtouchdelegate;

import android.app.Activity;
import android.graphics.Rect;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import me.yutao.testandroid.R;

public class TestTouchDelegateActivity extends Activity {
    TextView delegateView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_touch_delegate);
        delegateView = (TextView) findViewById(R.id.delegateView);

        delegateView.post(new Runnable() {
            @Override
            public void run() {
                TextView targetView = (TextView) findViewById(R.id.targetView);
                targetView.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return false;
                    }
                });
                targetView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(TestTouchDelegateActivity.this, "hello", Toast.LENGTH_LONG).show();
                    }
                });
                Rect rect = new Rect();
                delegateView.getHitRect(rect);
                rect.right += 100;
                rect.left -= 100;
                TouchDelegate touchDelegate = new TouchDelegate(rect, targetView);
                ((ViewGroup)delegateView.getParent()).setTouchDelegate(touchDelegate);

            }
        });


    }

}
