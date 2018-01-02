package stone.ast;

import java.util.List;

/**
 * 双目运算表达式
 * Created by allen on 2018/1/2.
 */
public class BinaryExpr extends ASTList {
    public BinaryExpr(List<ASTree> list) {
        super(list);
    }
    public String operator(){
        return ((ASTLeaf)child(1)).token().getText();
    }
    public ASTree right(){
        return child(2);
    }
}
