package stone.ast;

import stone.Token;

/**
 * Created by allen on 2018/1/2.
 */
public class Name extends ASTLeaf {
    public Name(Token t) {
        super(t);
    }
    public String name(){
        return token().getText();
    }
}
