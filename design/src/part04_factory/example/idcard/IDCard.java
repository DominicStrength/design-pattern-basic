package part04_factory.example.idcard;

import part04_factory.example.framework.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @feature 인식번호 카드 (프레임워크에서 분리됨을 명시하고자 별도의 패키지로 정의)
 * @문제4-2 IDCard 클래스에 카드 일련번호를 매기고, IDCardFactory 클래스가 일련번호와 소지자의 대응표를 갖도록 수정하세요.
 * 대응표란? 두 대상이 주어진 어떤 관계에 의하여 서로 짝이 되게 만든 표
 */
public class IDCard extends Product {

    private String owner;
    private UUID serialNumber;
    private Map<String, Object> corr;

    IDCard(String owner) {
        this.owner = owner;
        this.serialNumber = UUID.randomUUID();

        corr = new HashMap<>();
        corr.put(this.owner, this.serialNumber);

        System.out.println(owner + "의 카드를 만듭니다. 일련번호는 " + corr.get(owner) + " 입니다.");
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다. 일련번호는 " + this.serialNumber + " 입니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }
}
