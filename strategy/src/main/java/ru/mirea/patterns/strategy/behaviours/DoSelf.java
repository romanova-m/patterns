package ru.mirea.patterns.strategy.behaviours;

public class DoSelf implements DoBehaviour {
    @Override
    public void doHomework() {
        System.out.println("Done work myself");
    }
}
