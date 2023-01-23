package part05_singleton.quiz;

public class TicketMakerSingleton {

    private static TicketMakerSingleton INSTANCE = null;
    private static int ticket = 1000;

    public int getNextTicketNumber() {
        return this.ticket;
    }

    // 외부에서 인스턴스화 막음
    private TicketMakerSingleton() {}

    public static TicketMakerSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TicketMakerSingleton();
            ticket++;
        }
        return INSTANCE;
    }
}
