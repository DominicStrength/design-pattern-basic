package part03_template_method.example;

/**
 * Abstract 다시 한번 정리
 * class 앞에 'abstract' 키워드를 사용하여 정의
 * 하나 이상의 추상 메서드를 가지는 클래스를 말한다.
 * 상속을 하게되면 반드시 구현하도록 강제하는 클래스
 *
 * abstract 클래스는 상속을 위한 클래스이기 때문에 new 키워드를 통해 직접 객체를 생성할 수 없다.
 * java에서 다중 상속을 지원하지 않기 때문에 여러 개의 추상 클래스를 상속할 수 없다.
 *
 * 인터페이스와 다르게 static이나 final이 아닌(일반 변수) 필드를 가질 수 있고
 * public, protected, private 접근 제어자를 모두 사용 할 수 있다.
 */
public abstract class AbstractDisplay {

    /**
     * 하위 클래스에 구현을 맡기는 추상 메소드
     */
    public abstract void open();
    public abstract void print();
    public abstract void close();

    /**
     * display() 는 XXXDisplay 클래스들의 공통적인 기능을 하는 메소드
     * 상속 시 오버라이딩 할 필요가 없으므로 final 로 막아준다.
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
