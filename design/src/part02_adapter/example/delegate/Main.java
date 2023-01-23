package part02_adapter.example.delegate;

public class Main {
    public static void main(String[] args) {

        /**
         * 문제.txt.txt.txt 2-1
         */
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}
