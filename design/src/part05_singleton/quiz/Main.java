package part05_singleton.quiz;

public class Main {
    public static void main(String[] args) {

        /**
         * 문제.txt.txt.txt 5-1
         */
        // TicketMakerSingleton ticketMakerSingleton = TicketMakerSingleton.getInstance();
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(ticketMakerSingleton.getNextTicketNumber());
        // }

        /**
         * 문제.txt.txt.txt 5-2
         * Enum 은 Reflection 문제점도 해결해 줄 수 있다.
         */
        Triple triple = Triple.getInstance("ALPHA");
        Triple alpha = Triple.ALPHA;
        System.out.println(alpha == triple);

        /**
         * Bill Pugh Singleton Implementation - Reflection
         * Reflection 을 사용하면 private 생성자, 메서드에 접근이 가능해지며 단 하나의 객체라는 조건이 무너진다.
         */
        // Singleton singleton1 = Singleton.getInstance();
        // System.out.println("singleton1 : " + singleton1); // part04_singleton.quiz.Singleton@1a407d53
        // Singleton singleton2 = Singleton.getInstance();
        // System.out.println("singleton2 : " + singleton2); // part04_singleton.quiz.Singleton@1a407d53
        // try {
        //     Class<?> speackerClass = Class.forName("part04_singleton.quiz.Singleton");
        //
        //     Constructor<?> constructor = speackerClass.getDeclaredConstructor();
        //     constructor.setAccessible(true); // 접근 가능
        //
        //     Singleton singleton3 = (Singleton) constructor.newInstance();
        //     System.out.println("singleton3 : " + singleton3); // part04_singleton.quiz.Singleton@3d8c7aca
        // } catch (ClassNotFoundException e) {
        //     throw new RuntimeException(e);
        // } catch (NoSuchMethodException e) {
        //     throw new RuntimeException(e);
        // } catch (InvocationTargetException e) {
        //     throw new RuntimeException(e);
        // } catch (InstantiationException e) {
        //     throw new RuntimeException(e);
        // } catch (IllegalAccessException e) {
        //     throw new RuntimeException(e);
        // }

        /**
         * Serialization & Deserialization
         */
        // SerializationSingleton singleton = SerializationSingleton.getInstance();
        // singleton.setValue(1);
        //
        // FileOutputStream fis = null;
        // ObjectOutputStream oos = null;
        //
        // // Serialize
        // try {
        //     fis = new FileOutputStream("out.ser");
        //     oos = new ObjectOutputStream(fis);
        //     oos.writeObject(singleton);
        //     oos.close();
        //     fis.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        //
        // singleton.setValue(2);
        //
        // // Deserialize
        // SerializationSingleton singleton2 = null;
        //
        // try {
        //     FileInputStream fis2 = new FileInputStream("out.ser");
        //     ObjectInputStream ois = new ObjectInputStream(fis2);
        //     singleton2 = (SerializationSingleton) ois.readObject();
        //     ois.close();
        //     fis2.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } catch (ClassNotFoundException e) {
        //     System.out.println("singletons.SingletonEnum class not found");
        //     e.printStackTrace();
        // }
        //
        // System.out.println(singleton == singleton2); // false
    }
}
