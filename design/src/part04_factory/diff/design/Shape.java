package part04_factory.diff.design;

/**
 * 인터페이스(interface)
 * 1. 상수(static final)와 추상 메서드(abstract method)의 집합입니다.
 * 2. 추상 클래스보다 추상화 정도가 높으며 추상 클래스와는 다르게 구현부가 있는 일반 메서드, 일반 멤버 변수를 가질 수 없습니다.
 * 3. 메서드 선언시 'public abstract' 로 선언해야 하며, 생략 가능합니다. (컴파일 시 자동으로 생성해줌)
 * 4. 멤버 변수 선언시 public static final 로 선언해야 하며, 생략가능합니다. (컴파일 시 자동으로 생성해줌)
 * 5. implements 로 다중사옥이 가능하다.
 */
public interface Shape {

    // public default void draw();
    // void draw();
    public abstract void draw();

    // public static final 멤버_변수;
}
