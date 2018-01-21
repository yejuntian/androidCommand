package command.own.com.androidcommand.inter;

/**
 * 请求参数接口规范
 */

public interface IRequestParam<T> {

    public void put(String key, Object value);

    public Object get(String key);

    public int size();

    public T getRequestParam();
}
