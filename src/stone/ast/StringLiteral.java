package stone.ast;

import stone.Token;

/**
 *
 * Created by Administrator on 2018/1/3.
 */
public class StringLiteral extends ASTLeaf {
    public StringLiteral(Token t) {
        super(t);
    }
    public String value(){
        return token().getText();
    }
}
