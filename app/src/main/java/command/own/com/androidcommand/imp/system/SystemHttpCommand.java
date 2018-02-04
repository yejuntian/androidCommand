package command.own.com.androidcommand.imp.system;

import android.content.Context;

import command.own.com.androidcommand.http.HttpUtils;
import command.own.com.androidcommand.imp.AbsHttpCommand;

/**
 * 具体的命令
 */

public class SystemHttpCommand extends AbsHttpCommand<SystemRequestParam> {

    @Override
    public String excuteGet(Context context, String url, SystemRequestParam requestParam) {
        //这里实现log日志打印
        return HttpUtils.excuteGet(context, url, requestParam.getRequestParam());
    }

    @Override
    public String excutePost(Context context, String url, SystemRequestParam requestParam) {
        //这里实现log日志打印
        return HttpUtils.excutePost(context, url, requestParam.getRequestParam());
    }
}
