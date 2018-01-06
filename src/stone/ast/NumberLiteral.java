package stone.ast;
import stone.Token;

public class NumberLiteral extends ASTLeaf {
    public NumberLiteral(Token t) { super(t); }
    public int value() throws Exception { return token().getNumber(); }
}
