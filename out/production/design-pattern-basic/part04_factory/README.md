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