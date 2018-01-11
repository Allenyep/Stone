package chap7;

import chap6.Environment;
import chap7.FuncEvaluator.EnvEx;

import java.util.HashMap;

/**
 * 局部变量
 * Created by Administrator on 2018/1/11.
 */
public class NestedEnv implements Environment {
    protected HashMap<String,Object> values;
    protected Environment outer;//引用外层作用域
    public NestedEnv(Environment e){
        values=new HashMap<>();
        outer=e;
    }
    public NestedEnv(){
        this(null);
    }
    public void setOuter(Environment e){
        this.outer=e;
    }

    @Override
    public void put(String name, Object value) {
        Environment e=where(name);
        if(e==null){
            e=this;
        }
        ((EnvEx)e).putNew(name,value);
    }
    public Environment where(String name){//查找全局变量
        if(values.get(name)!=null){
            return this;
        }else if(outer==null){
            return null;
        }else {
            return ((EnvEx)outer).where(name);
        }
    }

    @Override
    public Object get(String name) {
        Object v=values.get(name);
        if(v==null&&outer!=null){
            return outer.get(name);
        }else {
            return v;
        }
    }
    public void putNew(String name,Object value){
        values.put(name,value);
    }
}
