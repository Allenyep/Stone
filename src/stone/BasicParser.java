package stone;

import java.util.HashSet;
import stone.Parser.Operators;
import static stone.Parser.rule;


/**
 * 语法分析器
 * Created by Administrator on 2018/1/3.
 */
public class BasicParser {
    HashSet<String> reserved=new HashSet<>();
    Operators operators=new Operators();
    Parser expr0=rule();
    //Parser primary=rule(PrimaryExpr.class);

}
