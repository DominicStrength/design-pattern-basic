이번 파트도 화이팅! 💪

각 파트의 퀴즈를 풀어서 올려보아요.📝

---
### 템플릿이란 무엇인가?
템플릿 구멍을 보면 어떤 형태의 문자인지 알 수 있지만, 실제로 어떤 문자 될지는 구체적인 필기 도구가 정해지기 전까지 모른다.<br>
그러나 `어떤 필기구를 사용하더라도 쓰여진 문자는 템플릿의 구멍 모양과 같습니다.`

### Template Method 패턴이란 무엇인가?
상위 클래스 쪽에 템플릿이 될 메소드가 정의되어 있고, 그 메소드 정의에 추상 메소드가 사용됩니다.<br/>
따라서 `상위 클래스의 코드만 봐서는 최종적으로 어떻게 처리되는지 알 수 없습니다.`<br/>
상위 클래스로 알 수 있는 것은 추상 메소드를 호출하는 방법뿐입니다.<br/><br/>
추상 메소드를 `실제로 구현하는 것은 하위 클래스`입니다.<br/>
하위 클래스에서 메소드를 구현하면 구체적인 처리 방식이 정해집니다.<br/>
다른 하위 클래스에서 구현을 다르게 하면, 처리도 다르게 이루어집니다.<br/>
그러나, 어느 하위 클래스에서 어떻게 구현하더라도 처리의 큰 흐름은 상위 클래스에서 구성한 대로 됩니다.

<blockquote><b>상위 클래스</b>에서 처리의 뼈대를 결정하고 <b>하위 클래스</b>에서 그 구체적 내용을 결정하는 디자인 패턴 <b>Template Method 패턴</b> 이라고 한다.</blockquote>

---
### 로직을 공통화할 수 있다
`비슷한 기능을 가진` A라는 클래스를 A1, A2, A3, ... A(n) 개 만들었다고 가정하였을 때, `A1에서 문제가 발생`하면 A1뿐만 아니라 `나머지 클래스들도 문제를 해결`해줘야하는 상황이 발생<br>
하지만, `Template Method 패턴`을 적용한 공통된 기능을 수행하는 클래스를 만들어 놓으면 `공통 클래스를 수정`함으로써 나머지 클래스들의 수정에 대한 `비용이 줄어`들게 된다.<br>

### 하위 클래스를 상위 클래스와 동일시한다
`CharDisplay`의 인스턴스와 `StringDisplay`의 인스턴스 모두 `AbstractDisplay`형 변수에 대입해서 `display` 메소드를 호출<br>
`리스코프 치환 원칙` 하위 클래스는 기본 클래스에 맹목적으로 대체되어야 한다.

---
### Java 8 Default method
일반적인 인터페이스 메소드 구현
```java
public interface 클래스 {
    public void doSomething();
}
```

디폴트 메소드 (상속 시 디폴트 메소드 구현도 함께 상속)
```java
public interface 클래스 {
    public default void doSomething() {
        System.out.println("...");
    }
}
```

다중 상속
```java
public interface A {
    public default void doSomething() {
        System.out.println("...");
    }
}
public interface B {
    public default void doSomething() {
        System.out.println("...");
    }
}

public class Main implements A, B {
}
```
<blockquote>Error:(33, 16) java: class Main inherits unrelated defaults for doSomething(int) from types A and B</blockquote>