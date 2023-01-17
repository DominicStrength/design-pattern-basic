package ch01_familiarize_with_design_patterns.part02_adapter.dong_min.example.delegate;

public class Main {
    public static void main(String[] args) {

        /**
         * 문제 2-1
         */
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}
