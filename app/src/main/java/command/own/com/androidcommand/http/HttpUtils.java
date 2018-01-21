package command.own.com.androidcommand.http;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by tianyejun on 2018/1/21.
 */

public class HttpUtils {
    public static String excuteGet(Context context, String url, HashMap<String, Object> requestParam) {
        return null;
    }

    public static String excutePost(Context context, String url, HashMap<String, Object> requestParam) {
        return null;
    }

    public interface OnHttpResultListener {
        void onResult(String result);
    }
}
