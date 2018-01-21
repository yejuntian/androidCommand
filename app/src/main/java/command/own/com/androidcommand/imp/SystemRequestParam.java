package command.own.com.androidcommand.imp;

import java.util.HashMap;
import java.util.Map;

import command.own.com.androidcommand.inter.IRequestParam;

public class SystemRequestParam implements IRequestParam<HashMap<String, Object>> {
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
    public HashMap<String, Object> getRequestParam() {
        return (HashMap<String, Object>) map;
    }
}
