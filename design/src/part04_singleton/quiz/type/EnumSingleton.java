package part04_singleton.quiz.type;

public enum EnumSingleton {

    INSTANCE;

    int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
