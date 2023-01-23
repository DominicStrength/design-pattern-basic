package part06_prototype.example;

import part06_prototype.example.framework.CommonAbstract;
import part06_prototype.example.framework.Product;

public class MessageBox extends CommonAbstract implements Product {

    private char decochar;

    public MessageBox(char decochar) { // *, /, -
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar); // *******
        }
        System.out.println();
        System.out.println(decochar + s + decochar); // '*' + "Hello, world." + '*'
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar); // *******
        }
        System.out.println();
    }

    // 자기 자신을 복제하는 메소드
    // 인터페이스가 구현되지 않는 경우에는 CloneNotSupportedException
    // @Override
    // public Product createCopy() {
    //     Product p = null;
    //     try {
    //         p = (Product) clone();
    //     } catch (CloneNotSupportedException e) {
    //         e.printStackTrace();
    //     }
    //     return p;
    // }

}
