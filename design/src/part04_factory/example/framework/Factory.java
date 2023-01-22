package part04_factory.example.framework;

/**
 * @feature createProduct 로 제품을 만들고 registerProduct 로 등록하는 절차 (factory)
 * @description Factory Method 패턴에서는 인스턴스를 생성할 때 Template Method 패턴을 사용한다.
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 추상 메소드로 기술하는 방법
    protected abstract Product createProduct(String owner);
    /*
    디폴트로 구현을 준비해두는 방법: 하위 클래스에서 구현하지 않는 경우 디폴트
    단, Product 클래스에 대해 직접 new를 실행하므로 Product 클래스를 추상 클래스로 둘 수는 없다.
    public Product createProduct(String name) {
        return new Product(name);
    }
    */
    protected abstract void registerProduct(Product product);
}
