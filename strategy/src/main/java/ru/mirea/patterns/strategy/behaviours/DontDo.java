package ru.mirea.patterns.strategy.behaviours;

public class DontDo implements DoBehaviour {
    @Override
    public void doHomework() {
        System.out.println("Did not do work");
    }
}
