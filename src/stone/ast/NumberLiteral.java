package stone.ast;

import stone.Token;

/**
 * Created by allen on 2017/12/31.
 */
public class NumberLiteral extends ASTLeaf {
    public NumberLiteral(Token t) {
        super(t);
    }
    public int value() throws Exception {
        return token().getNumber();
    }
}
