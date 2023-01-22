package part04_singleton.quiz.type;

/**
 * 동기화 문제를 해결하기 위한 방법
 * synchronized 키워드를 사용하면 어떤 한순간에는 하나의 스레드 만이 임계 영역(Critical Section) 안에서 실행하는 것이 보장된다.
 * synchronized 는 비용이 발생한다.
 * 단지, 객체를 안전하게 한 번 생성하기 위해 synchronized 를 사용하는 것인데, 객체에 접근할 때마다 synchronized 를 호출하게 된다. (성능 저하)
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
