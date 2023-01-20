package part04_factory.example.idcard;

import part04_factory.example.framework.Factory;
import part04_factory.example.framework.Product;

/**
 * createProduct 와 registerProduct 메소드를 구현
 * createProduct 는 IDCard 인스턴스를 생성하여 실제로 '제품을 만들고'
 * registerProduct 는 만들어진 제품을 등록한다.
 */
public class IDCardFactory extends Factory {
    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
