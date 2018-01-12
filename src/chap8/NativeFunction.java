package chap8;

import stone.StoneException;
import stone.ast.ASTree;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/1/12.
 */
public class NativeFunction {
    protected Method method;
    protected String name;
    protected int numParams;
    public NativeFunction(String n,Method m){
        name=n;
        method=m;
        numParams=m.getParameterTypes().length;
    }

    @Override
    public String toString() {
        return "<native:"+hashCode()+">";
    }
    public int numOfParameters(){
        return numParams;
    }
    public Object invoke(Object[] args, ASTree tree){
        try {
            return method.invoke(null,args);
        }catch (Exception e){
            throw new StoneException("bad native funciton call:"+name,tree);
        }
    }
}
