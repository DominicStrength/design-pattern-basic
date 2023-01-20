package part02_adapter.example.delegate;

/**
 * Target(대상) : Client가 의뢰한 기능
 */
public abstract class Print {
    public abstract void printWeak();
    public abstract void printStrong();
}
