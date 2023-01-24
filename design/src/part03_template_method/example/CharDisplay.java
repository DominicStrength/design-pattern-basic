package part03_template_method.example;

/**
 * 상위 클래스의 기능(open, print, close)을 구체적으로 구현하는 클래스
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        // 시작 문자열 "<<"를 표시한다
        System.out.print("<<");
    }

    @Override
    public void print() {
        // 필드에 저장해 둔 문자를 1회 표시한다
        System.out.print(ch);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다
        System.out.println(">>");
    }
}
