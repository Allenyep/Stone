package chap8;

import chap7.ClosureEvaluator;
import javassist.gluonj.util.Loader;

/**
 *
 * Created by Administrator on 2018/1/12.
 */
public class NativeRunner {
    public static void main(String[] args) throws Throwable{
        Loader.run(NativeInterpreter.class,args,NativeEvaluator.class, ClosureEvaluator.class);
    }
}
