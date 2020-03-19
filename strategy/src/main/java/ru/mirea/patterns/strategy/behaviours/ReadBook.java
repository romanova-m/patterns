package ru.mirea.patterns.strategy.behaviours;

public class ReadBook implements PrepareBehaviour {
    @Override
    public void prepare() {
        System.out.println("read book");
    }
}
