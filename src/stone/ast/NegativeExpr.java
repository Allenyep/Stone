package stone.ast;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

/**
 * Created by Administrator on 2018/1/3.
 */
public class NegativeExpr extends ASTList {
    public NegativeExpr(List<ASTree> list) {
        super(list);
    }
    public ASTree operand(){
        return child(0);
    }
    public String toString(){
        return "-"+operand();
    }
}
