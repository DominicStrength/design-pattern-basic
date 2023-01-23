package part06_prototype.example.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * Product 인터페이스를 이용해 인스턴스를 복제하는 클래스
 *
 * String 으로 나타낸 '이름'과 Product 인터페이스를 구현한 클래스의 '인스턴스'와의 대응 관계를 Map<String, Product>로 표현
 * 인수로 넘어오는 Product 형의 prototype 실제 클래스를 모르지만, use 메소드나 createCopy 메소드를 호출할 수 있는 인스턴스라는 것만 기억
 *
 * 주목할점은 Product 인터페이스나 Manager 클래스의 소스 코드에 MessageBox 클래스나 UnderlinePen 클래스의 이름이 '전혀 나오지 않는 점'에 주목
 * 독립적으로 수정할 수 있다는 점을 뜻함, 소스 코드 안에 클래스 이름을 기술하면 그 클래스와 밀접한 관계가 생겨 버립니다.
 */
public class Manager {

    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        return p.createCopy();
    }
}
