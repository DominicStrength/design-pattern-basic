package part02_adapter.example.inherit;

/**
 * 변환 장치
 * - Banner의 string을 상속받아 Print 인터페이스를 구현
 */
public class PrintBanner extends Banner implements Print {

    // Banner의 string
    public PrintBanner(String string) {
        super(string);
    }

    // ()
    @Override
    public void printWeak() {
        showWithParen();
    }

    // *
    @Override
    public void printStrong() {
        showWithAster();
    }
}
