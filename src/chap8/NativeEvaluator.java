package chap8;

import chap6.BasicEvaluator;
import chap6.Environment;
import chap7.FuncEvaluator;
import javassist.gluonj.Require;
import javassist.gluonj.Reviser;
import stone.StoneException;
import stone.ast.ASTree;
import chap6.BasicEvaluator.ASTreeEx;

import java.util.List;

/**
 *
 * Created by Administrator on 2018/1/12.
 */
@Reviser
@Require(FuncEvaluator.class)
public class NativeEvaluator {
    @Reviser
    public static class NativeArgEx extends FuncEvaluator.ArgumentsEx{
        public NativeArgEx(List<ASTree> list) {
            super(list);
        }

        @Override
        public Object eval(Environment callerEnv, Object value) {
            if(!(value instanceof NativeFunction))
                return super.eval(callerEnv, value);
            NativeFunction func=(NativeFunction) value;
            int nparams=func.numOfParameters();
            if(size()!=nparams)
                throw new StoneException("bad number of arguments",this);
            Object[] args=new Object[nparams];
            int num=0;
            for(ASTree a:this){
                ASTreeEx ae=(ASTreeEx)a;
                args[num++]=ae.eval(callerEnv);
            }
            return func.invoke(args,this);
        }
    }
}
