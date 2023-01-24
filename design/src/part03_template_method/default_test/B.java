package part03_template_method.default_test;

public interface B {
    public default void doSomething(int b) {
        System.out.println("interface B " + b);
    }
}
