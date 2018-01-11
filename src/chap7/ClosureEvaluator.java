package chap7;

import chap6.Environment;
import javassist.gluonj.Require;
import javassist.gluonj.Reviser;
import stone.ast.ASTree;
import stone.ast.Fun;

import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */
@Reviser
@Require(FuncEvaluator.class)
public class ClosureEvaluator {
    @Reviser
    public static class FunEx extends Fun {
        public FunEx(List<ASTree> list) {
            super(list);
        }
        public Object eval(Environment env){
            return new Function(parameters(),body(),env);
        }
    }
}
