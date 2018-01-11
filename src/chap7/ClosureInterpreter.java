package chap7;

import chap6.BasicInterpreter;
import stone.ClosureParser;
import stone.ParseException;

/**
 * Created by Administrator on 2018/1/11.
 */
public class ClosureInterpreter extends BasicInterpreter {
    public static void main(String[] args)throws ParseException {
        run(new ClosureParser(),new NestedEnv());
    }
}
