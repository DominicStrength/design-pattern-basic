package part05_singleton.example;

public enum EnumSingleton {
    INSTANCE;
    public void hello() {
        System.out.println("hello is called");
    }
}
