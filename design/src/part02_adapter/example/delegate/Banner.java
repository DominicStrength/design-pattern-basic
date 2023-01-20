package part02_adapter.example.delegate;

/**
 * 최종 결과물 제공
 * Adaptee(적응 대상자) : 이미 준비된 메소드를 가지는 역할
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
