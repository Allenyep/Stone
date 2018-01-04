package stone.ast;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

/**
 * Created by Administrator on 2018/1/3.
 */
public class WhileStmnt extends ASTList {
    public WhileStmnt(List<ASTree> list) {
        super(list);
    }
    public ASTree condition(){
        return child(0);
    }
    public ASTree body(){
        return child(1);
    }
    public String toString(){
        return "(while "+condition()+" "+body()+") ";
    }
}
