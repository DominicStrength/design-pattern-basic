package part04_singleton.quiz;

import part04_singleton.quiz.type.SerializationSingleton;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // TicketMaker ticketMaker = new TicketMaker();
        // for (int i = 0 ; i < 10 ; i++) {
        //     System.out.println(ticketMaker.getNextTicketNumber());
        // }

        /**
         * 문제.txt 5-1
         */
         // TicketMakerSingleton ticketMakerSingleton = new TicketMakerSingleton();
         // for (int i = 0 ; i < 10 ; i++) {
         //     int nextTicketNumber = ticketMakerSingleton.getNextTicketNumber();
         //     nextTicketNumber += i;
         //     System.out.println(nextTicketNumber);
         // }

        /**
         * 문제.txt 5-2
         * Enum 은 Reflection 문제점도 해결해 줄 수 있다.
         */
         // Triple triple = Triple.getInstance("ALPHA");
         // Triple triple1 = Triple.ALPHA;
         // System.out.println(triple1 == triple);


        /**
         * Bill Pugh Singleton Implementation - Inner Class
         * Singleton 클래스가 Class Loader 에 의해 로딩될 때 로딩되지 않다가 getInstance()가 호출될 때 JVM 메모리에 로드되고 객체를 생성하게 된다.
         * 또한, 클래스가 로드될 때 객체가 생성되기 때문에 multi-thread 환경에서도 안전하게 사용이 가능하다.
         */
        // HelperSingleton helperSingleton1 = HelperSingleton.getInstance();
        // HelperSingleton helperSingleton2 = HelperSingleton.getInstance();
        // System.out.println(helperSingleton1 == helperSingleton2);


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
         * Enum Singleton
         * 열거형을 직렬화할 때 필드 변수는 소실된다.
         * 즉, value 변수는 직렬화되지 않고 소실된다.
         */
        // EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        // EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        // System.out.println(singleton1 == singleton2);

        /**
         * Serialization & Deserialization
         */
        SerializationSingleton singleton = SerializationSingleton.getInstance();
        singleton.setValue(1);

        FileOutputStream fis = null;
        ObjectOutputStream oos = null;

        // Serialize
        try {
            fis = new FileOutputStream("out.ser");
            oos = new ObjectOutputStream(fis);
            oos.writeObject(singleton);
            oos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        singleton.setValue(2);

        // Deserialize
        SerializationSingleton singleton2 = null;

        try {
            FileInputStream fis2 = new FileInputStream("out.ser");
            ObjectInputStream ois = new ObjectInputStream(fis2);
            singleton2 = (SerializationSingleton) ois.readObject();
            ois.close();
            fis2.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("singletons.SingletonEnum class not found");
            e.printStackTrace();
        }

        System.out.println(singleton == singleton2); // false
    }
}
