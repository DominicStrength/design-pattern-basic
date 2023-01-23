package part06_prototype.example.framework;

/**
 * java.lang.Cloneable 인터페이스를 상속한 Product 인터페이스는 복제를 가능하게 합니다.
 * Product 인터페이스는 java.lang.Cloneable 인터페이스를 확장한 것이므로 CloneNotSupportedException 이 발생하지 않는다.
 */
public interface Product extends Cloneable {

    // public abstract 는 생략이 가능하지만, 기본을 잊지 않기 위해 작성
    // 사용
    public abstract void use(String s);
    // 복제
    public abstract Product createCopy();
}
