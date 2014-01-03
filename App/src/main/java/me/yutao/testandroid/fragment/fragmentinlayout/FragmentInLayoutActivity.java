package me.yutao.testandroid.fragment.fragmentinlayout;

import me.yutao.testandroid.R;
import android.app.Activity;
import android.app.Fragment;
import android.view.View;

public class FragmentInLayoutActivity extends Activity{

    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        Fragment f = new LevelTestFragment();
//        getSupportFragmentManager().beginTransaction().add(android.R.id.content, f, "LevelTestFragment").commitAllowingStateLoss();
//    }
//
//    @Override
//    public void onBackPressed() {
//        LevelTestFragment f = (LevelTestFragment)getSupportFragmentManager().findFragmentByTag("LevelTestFragment");
//        if (f != null) {
//            if (f.isAllowedBackPress()) {
//                super.onBackPressed();
//            }
//        } else {
//            super.onBackPressed();
//        }
//
//    }
    public void btnRemove(View v) {
        Fragment f = getFragmentManager().findFragmentByTag("LevelTestFragment");
        if (f != null) {
            getFragmentManager().beginTransaction().remove(f).commit();
        }
    }

public     void btnHide(View v) {
        Fragment f = getFragmentManager().findFragmentByTag("LevelTestFragment");
        if (f != null) {
            getFragmentManager().beginTransaction().hide(f).commit();
        }
    }

public    void btnReplace(View v) {
        Fragment f = getFragmentManager().findFragmentByTag("LevelTestFragment");
        Fragment f2 = new TestFragment2();
        if (f != null) {
            getFragmentManager().beginTransaction().replace(R.id.container, f2).commit();
        }
    }

public    void btnDetach(View v) {
        Fragment f = getFragmentManager().findFragmentByTag("LevelTestFragment");
        if (f != null) {
            getFragmentManager().beginTransaction().detach(f).commit();
        }
    }
}
