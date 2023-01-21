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

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
