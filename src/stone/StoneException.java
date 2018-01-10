package stone;

import stone.ast.ASTree;

/**
 *
 * Created by allen on 2017/12/30.
 */
public class StoneException extends RuntimeException{
    public StoneException(String m){super(m);}
    public StoneException(String m,ASTree t){
        super(m+" "+t.location());
    }
}
