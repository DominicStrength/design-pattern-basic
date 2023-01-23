package part05_singleton.quiz.types;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {

    private static final SerializationSingleton INSTANCE = new SerializationSingleton();
    private int value;

    private SerializationSingleton() {}

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static SerializationSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 직렬화 역직렬화 싱글턴 해결
     */
    protected Object readResolve() {
        return INSTANCE;
    }
}
