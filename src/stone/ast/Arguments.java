package stone.ast;

import java.util.List;

/**
 *
 * Created by Administrator on 2018/1/11.
 */
public class Arguments extends Postfix {
    public Arguments(List<ASTree> list) {
        super(list);
    }
    public int size(){
        return numChildren();
    }
}
