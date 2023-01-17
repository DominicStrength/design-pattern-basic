package ch01_familiarize_with_design_patterns.part02_adapter.dong_min.example.delegate;

/**
 * Adapter(적응자) : Adaptee(Banner)의 메소드를 사용해서 어떻게든 Target(Client)을 만족시키는 것
 */
public class PrintBanner extends Print {

    private Banner banner;

    // 직접 처리하지 않고 Banner 에게 위임
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    // PrintBanner 클래스의 printWeak 메소드가 호출되었을 때 자신이 처리하지 않고, 다른 인스턴스(showWithParen) 메소드에 맡기는 것
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
