package part04_singleton.quiz.types;

/**
 * static final 이라 멀티 쓰레드 환경에서도 안전함
 * 그러나, static 멤버는 당장 객체를 사용하지 않더라도 메모리에 적재하기 때문에 만일 리소스가 큰 객체일 경우, 공간 자원 낭비가 발생한다.
 * 예외처리를 할 수 없다.
 */
public class EagerInitialization {

    // 싱글톤 클래스 객체를 담을 인스턴스 변수
    private static final EagerInitialization INSTACNE = new EagerInitialization();

    // 생성자를 private 로 선언 (외부에서 new 사용 X)
    private EagerInitialization() {
    }

    public static EagerInitialization getInstance() {
        return INSTACNE;
    }
}
