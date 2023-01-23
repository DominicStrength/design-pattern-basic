package part05_singleton.example;

public class Singleton {

    // 인스턴스를 하나만 만들 수 있습니다. static 필드로 정의되고 인스턴스에서 초기화합니다.
    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() {
        return instance;
    }
}
