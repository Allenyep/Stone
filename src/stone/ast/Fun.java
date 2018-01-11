package stone.ast;

import java.util.List;

/**
 *
 * Created by Administrator on 2018/1/11.
 */
public class Fun extends ASTList {
    public Fun(List<ASTree> list) {
        super(list);
    }
    public ParameterList parameters(){
        return (ParameterList)child(0);
    }
    public BlockStmnt body(){
        return (BlockStmnt)child(1);
    }

    @Override
    public String toString() {
        return "(fun"+parameters()+" "+body()+")";
    }
}
