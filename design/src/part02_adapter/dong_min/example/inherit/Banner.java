package ch01_familiarize_with_design_patterns.part02_adapter.dong_min.example.inherit;

/**
 * 최종 결과물 제공
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
