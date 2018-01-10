package chap6;

/**
 * 环境对象接口
 * Created by Administrator on 2018/1/10.
 */
public interface Environment {
    void put(String name,Object value);
    Object get(String name);
}
