package ru.mirea.patterns.facade;

public class App {
    public static void main(String[] args) {
        ConcertFacade concert = new ConcertFacade(new Lights(), new Pianist(), new Singer(), new Curtains());
        concert.startConcert();
        concert.stopConcert();
    }
}
