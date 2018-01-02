package stone.ast;

import java.util.Iterator;

/**
 * 抽象语法树
 * Created by allen on 2017/12/31.
 */
public abstract class ASTree implements Iterable<ASTree> {
    public abstract ASTree child(int i);
    public abstract int numChildren();
    public abstract Iterator<ASTree> children();
    public abstract String location();

    @Override
    public Iterator<ASTree> iterator() {
        return children();
    }
}
