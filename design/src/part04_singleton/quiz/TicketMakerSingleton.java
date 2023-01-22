package part04_singleton.quiz;

public class TicketMakerSingleton {

    private static final int ticket = 1000;

    public TicketMakerSingleton() {
        System.out.println("티켓이 생성되었습니다.");
    }

    public static int getNextTicketNumber() {
        return ticket;
    }
}
