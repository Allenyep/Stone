package chap7;

import javassist.gluonj.util.Loader;
/**
 * Created by Administrator on 2018/1/11.
 */
public class ClosureRunner {
    public static void main(String[] args) throws Throwable{
        Loader.run(ClosureInterpreter.class,args,ClosureEvaluator.class);
    }
}
