package stone.ast;

import java.util.List;

/**
 * 参数列表
 * Created by Administrator on 2018/1/11.
 */
public class ParameterList extends ASTList {
    public ParameterList(List<ASTree> list) {
        super(list);
    }
    public String name(int i){
        return ((ASTLeaf)child(i)).token().getText();
    }
    public int size(){
        return numChildren();
    }
}
