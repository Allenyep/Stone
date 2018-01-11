package stone;
import stone.ast.Fun;

import static stone.Parser.rule;

/**
 * Created by Administrator on 2018/1/11.
 */
public class ClosureParser extends FuncParser {
    public ClosureParser() {
        primary.insertChoice(rule(Fun.class).sep("fun").ast(paramlist).ast(block));
    }
}
