package part03_template_method.default_test;

public class Main {

    interface A {
        default void doSomething(int a) {
            System.out.println("interface A " + a);
        }
    }

    interface B {
        default void doSomething(int b) {
            System.out.println("interface B " + b);
        }
    }

    static class Alphabet implements A, B  {
        @Override
        public void doSomething(int c) {
            A.super.doSomething(c);
            B.super.doSomething(c);
        }
    }

    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet();
        alphabet.doSomething(3);
    }
}

