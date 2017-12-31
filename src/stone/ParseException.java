package stone;

import java.io.IOException;

/**
 *
 * Created by allen on 2017/12/31.
 */
public class ParseException extends Exception {
    public ParseException(Token t){
        this("",t);
    }

    public ParseException(String msg,Token t){
        super("syntax error around "+location(t)+"."+msg);
    }

    private static String location(Token t){
        if(t==Token.EOF){
            return "last line";
        }else {
            return "\""+t.getText()+"\"at line"+t.getLineNumber();
        }
    }
    public ParseException(IOException e){
        super(e);
    }
    public ParseException(String msg){
        super(msg);
    }
}
