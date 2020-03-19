package ru.mirea.patterns.observer;

public class Greeter implements Observer {
    @Override
    public void update(Object event) {
        System.out.println("Greetings from greeter!");
    }
}
