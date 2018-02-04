package command.own.com.androidcommand;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import command.own.com.androidcommand.http.HttpTask;
import command.own.com.androidcommand.http.HttpUtils;
import command.own.com.androidcommand.imp.system.SystemHttpCommand;
import command.own.com.androidcommand.imp.system.SystemRequestParam;
import command.own.com.androidcommand.inter.IHttpCommand;

/**
 * 这里使用命令设计模式
 * IHttpCommand:相当于command命令接口
 * SystemHttpCommand:相当于具体命令实现
 * HttpUtils:相当于接收者
 * HttpTask:相当于请求者
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HttpTask.Builder builder = new HttpTask.Builder(this, "url", new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {

            }
        });
        //创建请求参数
        SystemRequestParam requestParam = new SystemRequestParam();
        requestParam.put("name", "zhangsan");
        requestParam.put("age", "20");

        //设置请求方式，后开始网络请求
        builder.setRequestCommand(new SystemHttpCommand())
                .setRequestParam(requestParam)
                .setRequestType(IHttpCommand.RequestType.GET)
                .build().builder();

    }
}
