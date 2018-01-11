package chap7;

import chap6.BasicInterpreter;
import stone.FuncParser;
import stone.ParseException;

/**
 *
 * Created by Administrator on 2018/1/11.
 */
public class FuncInterpreter extends BasicInterpreter{
    public static void main(String[] args) throws ParseException{
        run(new FuncParser(),new NestedEnv());
    }
}
