package me.yutao.testandroid.testevent;

import java.util.Objects;

/**
 * Created with Android Studio
 * User: Chris.Hou
 * Date: 3/17/14
 */
public class Utils {
    public static String getTag(Object t) {
        if (t instanceof String) {
            String s = (String) t;
            String[] array = s.split(",");
            return array[0];
        }
        return "";
    }

    public static boolean isDispatchTouchEvent(Object t, boolean r) {
        boolean b = false;
        if (t instanceof String) {
            String s = (String) t;
            String[] array = s.split(",");
            if (array.length == 4) {
                b = "true".equals(array[1]);
            } else {
                b = false;
            }
        }
        return b || r;
    }

    public static boolean isInterceptTouchEvent(Object t, boolean r) {
        boolean b = false;
        if (t instanceof String) {
            String s = (String) t;
            String[] array = s.split(",");
            if (array.length == 4) {
                b = "true".equals(array[2]);
            } else {
                b = false;
            }
        }
        return b || r;
    }
    public static boolean isTouchEvent(Object t, boolean r) {
        boolean b = false;
        if (t instanceof String) {
            String s = (String) t;
            String[] array = s.split(",");
            if (array.length == 4) {
                b = "true".equals(array[3]);
            } else {
                b = false;
            }
        }
        return b || r;
    }
}
