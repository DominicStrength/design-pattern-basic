package part04_singleton.quiz.types;

/**
 * Bill Pugh Solution (LazyHolder)
 * 권장되는 두가지 방법중 하나
 * 멀티쓰레드 환경에서 안전하고 Lazy Loading(나중에 객체 생성)도 가능한 완벽한 싱글톤 기법
 * static 메소드에서는 static 멤버만을 호출할 수 있기 때문에 내부 클래스를 static 으로 설정
 * 
 * 다만 클라이언트가 임의로 싱글톤을 파괴할 수 있다는 단점을 지님 (Reflection API, 직렬화/역직렬화 를 통해)
 */
public class HelperSingleton {

    private HelperSingleton() {}

    private static class SingleInstanceHolder {
        private static final HelperSingleton INSTANCE = new HelperSingleton();
    }

    public static HelperSingleton getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }
}
