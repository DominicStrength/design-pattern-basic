이번 파트도 화이팅! 💪

각 파트의 퀴즈를 풀어서 올려보아요.📝

---
### Factory Method
Factory Method 패턴에서는 인스턴스 생성 방법을 상위 클래스에서 결정하되, 구체적인 클래스 이름까지는 결정하지 않습니다.<br/>
구체적인 살은 모두 하위 클래스에서 붙입니다.<br/>
이로써 인스턴스 생성을 위한 뼈대(프레임워크)와 실제 인스턴스를 생성하는 클래스를 나누어 생각할 수 있게 됩니다.

### static Factory Method
인스턴스 생성을 위한 메소드(static 메소드) 전반을 Factory Method 라고 부르는 경우가 있습니다.<br/>
Java API 래퍼런스에서도 인스턴스 생성을 위한 클래스 메소드를 <b>static Factory Method</b>로 표현하기도 합니다.<br/>
static Factory Method 로서는 create, newInstance, getInstance 등의 이름이 자주 사용된다.<br/>

+ java.security.SecureRandom 의 <b>getInstance 메소드</b>는 난수 생성 알고리즘 이름을 지정해서 SecureRandom 인스턴스를 생성하는 static Factory Method 입니다.<br/>
<blockquote>SecureRandom random = SecureRandom.getInstance("NativePRNG");</blockquote>

+ java.util.List 의 <b>of 메소드</b>는 구체적인 요소를 주면 List 인스턴스를 생성하는 static Factory Method 입니다.
<blockquote>List&lt;String&gt; list = List.of("Alice", "Bob", "Chris");</blockquote>

+ java.util.Arrays 의 <b>asList 메소드</b>는 지정된 배열이나 열거한 요소로부터 List 인스턴스를 생성하는 static Factory Method 입니다.
<blockquote>List&lt;String&gt; list1 = Arrays.asList(arr);</blockquote>

+ java.lang.String 의 <b>now 메소드</b>는 다양한 형태의 문자열 표현을 얻는 static Factory Method 입니다.
<blockquote>String string = String.valueOf('A');</blockquote>

+ java.time.Instance 의 <b>now 메소드</b>는 현재 시간을 나타내는 Instant 의 인스턴스를 생성하는 static Factory Method 입니다.
<blockquote>Instant instant = Instant.now();</blockquote>

<hr>

### 인터페이스와 추상클래스 
<b>추상클래스란?</b><br><br>
추상클래스는 추상 메서드를 선언하여 <b>상속을 통해 자손 클래스에서 완성하도록 유도</b>하는 클래스입니다.<br>
상속을 위한 클래스이기 때문에 따로 객체를 생성할 수 없습니다.<br>
```java
abstract class 클래스이름 {
    ...
    public abstract void 메서드이름();
}
```
<br>
<b>인터페이스란?</b><br><br>
인터페이스는 다중상속(구현)이 가능합니다.<br>

```java
interface 인터페이스이름 {
    public static final 상수이름 = 값;
    public abstract void 메서드이름();
}
```

### 추상클래스와 인터페이스 차이점
추상클래스와 인터페이스의 공통점은 추상메서드를 사용할 수 있는 것입니다.<br>
#### 사용의도 차이점
추상클래스는 <b>IS - A "~이다."</b><br>
인터페이스는 <b>HAS - A "~을 할 수 있는"</b><br>
이렇게 구분하는 이유는 다중상속의 가능 여부에 따라 용도를 저한 것 같습니다.<br>
자바의 특성상 한개의 클래스만을 상속하기 때문에 해당 클래스의 구분을 추상클래스 상속을 통해 해결하고<br>
할 수 있는 기능들을 인터페이스로 구현합니다.<br>
#### 공통된 기능 사용 여부
만약 모든 클래스가 <b>인터페이스를 사용해서 기본 틀을 구성한다면... 공통으로 필요한 기능들도 모든 클래스에서 오버라이딩 하여 재정의 해야하는 번거로움이 있습니다.</b><br>
이렇게 공통된 기능은 추상클래스를 이용해서 일반 메서드를 작성하여 자식 클래스에서 사용할 수 있게 하면 됩니다.<br>


