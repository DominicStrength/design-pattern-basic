package part02_adapter.example.inherit;

import part02_adapter.example.delegate.Print;
import part02_adapter.example.delegate.PrintBanner;

public class Main {
    public static void main(String[] args) {

        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}
