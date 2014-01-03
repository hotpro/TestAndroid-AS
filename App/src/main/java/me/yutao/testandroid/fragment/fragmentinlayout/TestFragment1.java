package me.yutao.testandroid.fragment.fragmentinlayout;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created with Android Studio
 * User: Chris.Hou
 * Date: 10/17/13
 */
public class TestFragment1 extends Fragment {
    private static final String TAG = TestFragment1.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        TextView textView = new TextView(getActivity());
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        textView.setText(TAG);

        return textView;
    }
}
