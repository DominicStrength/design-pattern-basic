package part06_prototype.example;

import part06_prototype.example.framework.Manager;
import part06_prototype.example.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        // 등록
        manager.register("string message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 생성과 사용
        Product p1 = manager.create("string message");
        p1.use("Hello, world.");

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
