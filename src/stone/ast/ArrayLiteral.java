package stone.ast;

import java.util.List;

/**
 * Created by Administrator on 2018/1/20.
 */
public class ArrayLiteral extends ASTList {
    public ArrayLiteral(List<ASTree> list) {
        super(list);
    }
    public int size(){
        return numChildren();
    }
}
