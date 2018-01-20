package stone.ast;

import java.util.List;

/**
 * Created by Administrator on 2018/1/20.
 */
public class ArrayRef extends Postfix {
    public ArrayRef(List<ASTree> list) {
        super(list);
    }
    public ASTree index(){
        return child(0);
    }

    @Override
    public String toString() {
        return "["+index()+"]";
    }
}
