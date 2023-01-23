package part04_singleton.quiz.types;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 객체 생성에 대한 관리를 내부적으로 처리
 * 메서드를 호출했을 때 인스턴스 변수의 null 유무에 따라 초기화 (lazy)
 * 위의 미사용 고정 메모리 차지의 한계점을 극복
 * <p>
 * 그러나 쓰레드 세이프(Thread Safe) 하지 않는 치명적인 단점을 가지고 있음
 */
class LazySingleton {
    // 싱글톤 클래스 객체를 담을 인스턴스 변수
    private static LazySingleton singleton = null;

    // 생성자를 private 로 선언 (외부에서 new 사용 X)
    private LazySingleton() {
    }

    // 외부에서 정적 메서드를 호출하면 그제서야 초기화 진행 (lazy)
    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}

public class LazyInitialization {
    public static void main(String[] args) {
        // 1. 싱글톤 객체를 담을 배열
        LazySingleton[] singletons = new LazySingleton[10];

        // 2. 스레드 풀 생성
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 3. 반복문을 통해 10개의 스레드가 동시에 인스턴스 생성
        for (int i = 0; i < 10; i++) {
            final int num = i;
            executorService.submit(() -> {
                singletons[num] = LazySingleton.getInstance();
            });
        }
        
        // 4. 종료
        executorService.shutdown();

        // 5. 싱글톤 객체 주소 출력
        for (LazySingleton s : singletons) {
            System.out.println(s.toString());
        }
    }
}