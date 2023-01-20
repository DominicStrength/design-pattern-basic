package part04_factory.example.framework;

/**
 * 공장: createProduct 로 제품을 만들고 registerProduct 로 등록하는 절차
 *
 * Factory Method 패턴에서는 인스턴스를 생성할 때 Template Method 패턴을 사용한다.
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    public abstract Product createProduct(String owner);
    public abstract void registerProduct(Product product);
}
