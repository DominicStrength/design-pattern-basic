package part05_singleton.quiz;

public class TicketMaker {

    private int ticket = 1000;

    public int getNextTicketNumber() {
        return ticket++;
    }
}
