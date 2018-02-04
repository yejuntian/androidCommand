package command.own.com.androidcommand.http;

import android.content.Context;
import android.os.AsyncTask;

import command.own.com.androidcommand.imp.system.SystemHttpCommand;
import command.own.com.androidcommand.inter.IHttpCommand;
import command.own.com.androidcommand.inter.IRequestParam;

/**
 * 请求者--Invoker 调用命令
 * 并且持有命令对象
 */

public class HttpTask extends AsyncTask<String, Void, String> {
    private Param param;

    public HttpTask(Param param) {
        this.param = param;
    }

    @Override
    protected String doInBackground(String... strings) {
        return this.param.httpCommand.excute(this.param.context, this.param.url, this.param.requestType, this.param.requestParam);
    }

    @Override
    protected void onPostExecute(String result) {
        //执行命令
        if (this.param.onHttpResultListener != null) {
            this.param.onHttpResultListener.onResult(result);
        }
    }

    public void builder() {
        execute();
    }

    //采用buider设计模式
    public static class Builder {
        private Param P;

        public Builder(Context context, String url, HttpUtils.OnHttpResultListener onHttpResultListener) {
            this.P = new Param(context, url, onHttpResultListener);
        }

        public Builder setRequestType(IHttpCommand.RequestType requestType) {
            this.P.requestType = requestType;
            return this;
        }

        public Builder setRequestCommand(IHttpCommand httpCommand) {
            this.P.httpCommand = httpCommand;
            return this;
        }

        public Builder setRequestParam(IRequestParam requestParam) {
            this.P.requestParam = requestParam;
            return this;
        }

        public HttpTask build() {
            return new HttpTask(P);
        }
    }

    public static class Param {
        private IHttpCommand httpCommand;
        private Context context;
        private String url;
        private HttpUtils.OnHttpResultListener onHttpResultListener;
        public IHttpCommand.RequestType requestType;
        public IRequestParam requestParam;

        public Param(Context context, String url, HttpUtils.OnHttpResultListener onHttpResultListener) {
            this.context = context;
            this.url = url;
            this.onHttpResultListener = onHttpResultListener;
            this.requestType = IHttpCommand.RequestType.GET;
            this.httpCommand = new SystemHttpCommand();
            this.onHttpResultListener = onHttpResultListener;
        }
    }
}
