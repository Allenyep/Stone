package stone.ast;

import stone.Token;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * Created by allen on 2017/12/31.
 */
public class ASTLeaf extends ASTree {
    private static ArrayList<ASTree> empty=new ArrayList<>();
    protected Token token;
    public ASTLeaf(Token t){
        token=t;
    }

    @Override
    public ASTree child(int i) {//返回i个节点
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int numChildren() {//返回子节点的个数
        return 0;
    }

    @Override
    public Iterator<ASTree> children() {//迭代器
        return empty.iterator();
    }

    @Override
    public String location() {
        return "at line"+token.getLineNumber();
    }

    @Override
    public String toString() {
        return  token.getText();
    }

    public Token token(){
        return token;
    }
}
