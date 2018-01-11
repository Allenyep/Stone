package stone;
import stone.ast.Arguments;
import stone.ast.DefStmnt;
import stone.ast.ParameterList;

import static stone.Parser.rule;

/**
 * 函数分析器
 * Created by Administrator on 2018/1/11.
 */
public class FuncParser extends BasicParser {
    Parser param=rule().identifier(reserved);
    Parser params=rule(ParameterList.class)
            .ast(param).repeat(rule().sep(",").ast(param));
    Parser paramlist=rule().sep("(").maybe(params).sep(")");
    Parser def=rule(DefStmnt.class)
            .sep("def").identifier(reserved).ast(paramlist).ast(block);
    Parser args=rule(Arguments.class)
            .ast(expr).repeat(rule().sep(",").ast(expr));
    Parser postfix=rule().sep("(").maybe(args).sep(")");

    public FuncParser(){
        reserved.add(")");
        primary.repeat(postfix);
        simple.option(args);
        program.insertChoice(def);
    }

}
