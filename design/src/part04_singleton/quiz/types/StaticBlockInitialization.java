package part04_singleton.quiz.types;

/**
 * static block 을 이용해서 예외를 잡을 수 있다.
 * 그러나, 여전히 static 의 특성으로 사용하지도 않는데도 공간을 차지한다.
 * static block : 클래스가 로딩되고 클래스 변수가 준비된 후 자동으로 실행되는 블록
 */
public class StaticBlockInitialization {
    // 싱글톤 클래스 객체를 담을 인스턴스 변수
    private static StaticBlockInitialization instance;

    // 생성자를 private로 선언 (외부에서 new 사용 X)
    private StaticBlockInitialization() {}

    // static 블록을 이용해 예외 처리
    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("싱글톤 객체 생성 오류");
        }
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }
}
