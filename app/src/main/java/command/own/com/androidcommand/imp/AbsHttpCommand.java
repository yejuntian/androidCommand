package command.own.com.androidcommand.imp;

import android.content.Context;

import command.own.com.androidcommand.inter.IHttpCommand;
import command.own.com.androidcommand.inter.IRequestParam;


public abstract class AbsHttpCommand<T extends IRequestParam> implements IHttpCommand<T> {
    @Override
    public final String excute(Context context, String url, RequestType requestType, T requestParam) {
        if (requestType == RequestType.GET) {
            return excuteGet(context, url, requestParam);
        } else if (requestType == RequestType.POST) {
            return excutePost(context, url, requestParam);
        } else if (requestType == RequestType.DELETE) {
            return excuteDelete(context, url, requestParam);
        } else {
            return excuteGet(context, url, requestParam);
        }
    }

    /**
     * 执行get请求
     *
     * @param context
     * @param url
     * @param requestParam
     * @return
     */
    public String excuteGet(Context context, String url, T requestParam) {
        return excute(context, url, RequestType.GET, requestParam);
    }

    /**
     * 执行post请求
     *
     * @param context
     * @param url
     * @param requestParam
     * @return
     */
    public String excutePost(Context context, String url, T requestParam) {
        return excute(context, url, RequestType.POST, requestParam);
    }

    /**
     * 执行Delete请求
     *
     * @param context
     * @param url
     * @param requestParam
     * @return
     */
    public String excuteDelete(Context context, String url, T requestParam) {
        return excute(context, url, RequestType.DELETE, requestParam);
    }

}
