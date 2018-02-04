package command.own.com.androidcommand.http;

import android.content.Context;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/**
 * 接收者--实现具体的功能
 */

public class HttpUtils {
    public static String excuteGet(Context context, String url, HashMap<String, Object> requestParam) {
        //拼接参数
        StringBuffer param = new StringBuffer(url + "?");
        int i = 0;
        for (String key : requestParam.keySet()) {
            Object value = requestParam.get(key);
            param.append(key);
            param.append("=");
            param.append(value);
            if (i < requestParam.size() - 1) {
                param.append("&");
            }
            i++;
        }

        String result = null;
        StringBuffer stringBuffer = null;
        try {
            URL requestUrl = new URL(param.toString());
            HttpURLConnection connection = (HttpURLConnection) requestUrl.openConnection();
            connection.setReadTimeout(5000);
            connection.setRequestMethod("GET");
            connection.connect();
            stringBuffer = new StringBuffer();
            if (connection.getResponseCode() == 200) {
                InputStream inputStream = connection.getInputStream();
                stringBuffer.append(inputStream.toString());
            }
            //网络请求
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }


    public static String excutePost(Context context, String url, HashMap<String, Object> requestParam) {
        //拼接参数
        StringBuffer param = new StringBuffer(url + "?");
        int i = 0;
        for (String key : requestParam.keySet()) {
            Object value = requestParam.get(key);
            param.append(key);
            param.append("=");
            param.append(value);
            if (i < requestParam.size() - 1) {
                param.append("&");
            }
            i++;
        }

        //TODO
        return null;

    }

    public interface OnHttpResultListener {
        void onResult(String result);
    }
}
