package chap6;

import javassist.gluonj.util.Loader;

/**
 * Created by Administrator on 2018/1/10.
 */
public class Runner {
    public static void main(String[] args) throws Throwable{
        Loader.run(BasicInterpreter.class,args,BasicEvaluator.class);
    }
}
