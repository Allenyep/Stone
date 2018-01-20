package chap9;

import chap7.ClosureEvaluator;
import chap8.NativeEvaluator;
import javassist.gluonj.util.Loader;

/**
 * Created by Administrator on 2018/1/20.
 */
public class ClassRunner {
    public static void main(String[] args) throws Throwable{
        Loader.run(ClassInterpreter.class,args,ClassEvaluator.class, NativeEvaluator.class, ClosureEvaluator.class);
    }
}
