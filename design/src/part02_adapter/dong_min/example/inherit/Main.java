package ch01_familiarize_with_design_patterns.part02_adapter.dong_min.example.inherit;

public class Main {
    public static void main(String[] args) {

        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}
