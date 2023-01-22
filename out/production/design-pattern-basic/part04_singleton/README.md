이번 파트도 화이팅! 💪

각 파트의 퀴즈를 풀어서 올려보아요.📝

---
### Singleton 패턴
+ 지정한 클래스의 인스턴스가 반드시 1개만 존재한다는 것을 보증하고 싶을 때
+ 인스턴스가 하나만 존재한다는 것을 프로그램 상에서 표현하고 싶을 때

인스턴스가 하나만 존재하는 것을 보증하는 패턴을 <b>Singleton 패턴</b> 이라고 부릅니다.<br>
singleton이란 요소가 하나뿐인 집합을 말합니다.<br>

<b>Singleton</b>은 <b>static</b> 필드(클래스 변수)로 정의되고 Singleton 클래스의 인스턴스에서 초기화합니다.<br>
초기화는 Singleton 클래스를 로드할 때 한 번만 실행됩니다.<br>
<b>Singleton</b> 클래스의 <b>생성자는 private</b>로 되어 있습니다. 이는 <b>Singleton</b> 클래스 외부에서 생성자 호출을 금지하기 위해서입니다.<br>
<blockquote>new Singleton()</blockquote>
다음과 같은 코드가 이 클래스 외부에 있어도 컴파일할 때 에러가 발생합니다.<br>

<b>Singleton</b> 클래스의 유일한 인스턴스를 얻는 메소드로 <b>getInstance</b> 가 제공됩니다.<br>

```java
public class Singleton {
    private static Singleton singleton = new Singleton();
    
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }
    
    public static Singleton getInstance() {
        return singleton;
    }
```