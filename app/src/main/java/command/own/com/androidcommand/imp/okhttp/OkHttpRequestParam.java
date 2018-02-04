package command.own.com.androidcommand.imp.okhttp;

import java.util.HashMap;
import java.util.Map;

import command.own.com.androidcommand.inter.IRequestParam;

/**
 * okHttp请求参数
 */

public class OkHttpRequestParam implements IRequestParam<String> {
    private Map<String, Object> map = new HashMap<String, Object>();

    @Override
    public void put(String key, Object value) {
        map.put(key, value);
    }

    @Override
    public Object get(String key) {
        return map.get(key);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public String getRequestParam() {
        //需要转换为键值对形势
        return null;
    }
}
