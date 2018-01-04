package stone.ast;

import java.util.List;

/**
 *
 * Created by Administrator on 2018/1/3.
 */
public class PrimaryExpr extends ASTList {
    public PrimaryExpr(List<ASTree> list) {
        super(list);
    }
    public static ASTree create(List<ASTree> c){
        return c.size()==1?c.get(0):new PrimaryExpr(c);
    }
}
