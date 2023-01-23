package part06_prototype.question;


import part06_prototype.question.framework.Manager;
import part06_prototype.question.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 준비
        Manager manager = new Manager();

        // 복사 생성자 호출
        UnderlinePen upen = new UnderlinePen(new UnderlinePen('-'));
        MessageBox mbox = new MessageBox(new MessageBox('*'));
        MessageBox sbox = new MessageBox(new MessageBox('/'));

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
