package command.own.com.androidcommand.imp.okhttp;

import android.content.Context;

import command.own.com.androidcommand.imp.AbsHttpCommand;

/**
 * 具体的命令
 * OkHttp命令
 */

public class OkHttpCommand extends AbsHttpCommand<OkHttpRequestParam>{
    @Override
    public String excuteGet(Context context, String url, OkHttpRequestParam requestParam) {
        //持有接收者对象引用（okHttp网络请求对象）
        return super.excuteGet(context, url, requestParam);
    }

    @Override
    public String excutePost(Context context, String url, OkHttpRequestParam requestParam) {
        //持有接收者对象引用（okHttp网络请求对象）
        return super.excutePost(context, url, requestParam);
    }

    @Override
    public String excuteDelete(Context context, String url, OkHttpRequestParam requestParam) {
        //持有接收者对象引用（okHttp网络请求对象）
        return super.excuteDelete(context, url, requestParam);
    }
}
