package stone;

/**
 * 词法分析
 * Created by allen on 2017/12/30.
 */
public abstract class Token {
    public static final Token EOF=new Token(-1) {};//end of file
    public static final String EOL="\\n";//end of line
    private int lineNumber;
    protected Token(int line){
        this.lineNumber=line;
    }

    public int getLineNumber() {
        return lineNumber;
    }
    public boolean isIdentifier(){
        return false;
    }
    public boolean isNumber(){
        return false;
    }
    public boolean isString(){
        return false;
    }
    public int getNumber() throws Exception {
        throw new Exception("not number token");
    }
    public String getText(){
        return "";
    }
}
