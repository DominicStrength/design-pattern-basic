package part05_singleton.quiz.types;

/**
 * enum 은 애초에 멤버를 만들때 private 로 만들고 한번만 초기화 하기 때문에 thread safe 함
 * enum 내에서 상수 뿐만 아니라, 변수나 메서드를 선언해 사용이 가능하기 때문에, 이를 이용해 싱글톤 클래스 처럼 응용이 가능
 * 클라이언트에서 Reflection 을 통한 공격에도 안전
 * 
 * 하지만 만일 싱글톤 클래스를 멀티톤(일반적인 클래스)로 마이그레이션 해야할 때 처음부터 코드를 다시 짜야 되는 단점이 존재
 * 클래스 상속이 필요할때, enum 이외 클래스 상속은 불가능하다.
 */
public enum EnumSingleton {

    // INSTANCE;
    //
    // private final Client client;
    //
    // EnumSingleton() {
    //     dbClient = Database.getClient;
    // }
    //
    // public static EnumSingleton getInstance() {
    //     return INSTANCE;
    // }
    //
    // public Client getClient() {
    //     return doClient;
    // }
}
