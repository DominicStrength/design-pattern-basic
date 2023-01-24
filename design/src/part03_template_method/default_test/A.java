package part03_template_method.default_test;

public interface A {
    public default void doSomething(int a) {
        System.out.println("interface A " + a);
    }
}
