package stone.ast;

import java.util.List;

/**
 * 点 方法名
 * Created by Administrator on 2018/1/20.
 */
public class Dot extends Postfix {
    public Dot(List<ASTree> list) {
        super(list);
    }
    public String name(){
        return ((ASTLeaf)child(0)).token().getText();
    }

    @Override
    public String toString() {
        return "."+name();
    }
}
