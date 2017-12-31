package stone;

/**
 * 启动类
 * Created by allen on 2017/12/31.
 */
public class LexerRunner {
    public static void main(String[] args) throws ParseException{
        Lexer l=new Lexer(new CodeDialog());
        for (Token t;(t=l.read())!=Token.EOF;){
            System.out.println("=>"+t.getText());
        }
    }
}
