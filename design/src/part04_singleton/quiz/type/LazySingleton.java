package part04_singleton.quiz.type;

public class LazySingleton {

    private static LazySingleton singleton = null;

    private LazySingleton() {
        System.out.println("인스턴스를 생성했습니다.........." + singleton);
    }

    // Lazy Initialization
    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
