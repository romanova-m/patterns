package ru.mirea.patterns.facade;

public class ConcertFacade {

    private Lights lights;
    private Pianist pianist;
    private Singer singer;
    private Curtains curtains;

    ConcertFacade(Lights lights, Pianist pianist, Singer singer, Curtains curtains) {
        this.lights = lights;
        this.pianist = pianist;
        this.singer = singer;
        this.curtains = curtains;
    }


    public void startConcert() {
        System.out.println("\nConcert starts:");
        curtains.open();
        lights.on();
        pianist.play();
        singer.sing();
    }


    public void stopConcert() {
        System.out.println("\nConcert stopped:");
        singer.stop();;
        pianist.stop();
        lights.off();
        curtains.close();
    }
}
