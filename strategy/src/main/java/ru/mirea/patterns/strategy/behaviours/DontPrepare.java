package ru.mirea.patterns.strategy.behaviours;

public class DontPrepare implements PrepareBehaviour {
    @Override
    public void prepare() {
        System.out.println("Did not prepare");
    }
}
