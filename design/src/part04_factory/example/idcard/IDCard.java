package part04_factory.example.idcard;

import part04_factory.example.framework.Product;

/**
 * 인식번호 카드 (프레임워크에서 분리됨을 명시하고자 별도의 패키지로 정의)
 */
public class IDCard extends Product {

    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
