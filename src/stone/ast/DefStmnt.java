package stone.ast;

import stone.Token;

import java.util.List;

/**
 *
 * Created by Administrator on 2018/1/11.
 */
public class DefStmnt extends ASTList {
    public DefStmnt(List<ASTree> list) {
        super(list);
    }
    public String name(){
        return ((ASTLeaf)child(0)).token().getText();
    }
    public ParameterList parameters(){
        return (ParameterList)child(1);
    }
    public BlockStmnt body(){
        return (BlockStmnt)child(2);
    }
    public String toString(){
        return "(def "+name()+" "+parameters()+" "+body()+")";
    }
}
