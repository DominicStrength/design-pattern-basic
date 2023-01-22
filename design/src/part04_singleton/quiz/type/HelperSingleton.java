package part04_singleton.quiz.type;

public class HelperSingleton {

    private HelperSingleton() {
    }

    private static class SingletonHelper {
        private static final HelperSingleton INSTANCE = new HelperSingleton();
    }

    public static HelperSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
