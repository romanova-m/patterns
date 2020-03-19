package ru.mirea.patterns.fabric;

public abstract class Chair {
    //factory method for chairs
    static Chair createChair(String type) {
        switch (type) {
            case "round": return new RoundChair();
            default: return new SquareChair();
        }
    }

    abstract String message();
}
