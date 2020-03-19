package ru.mirea.patterns.observer;

public class Repeater implements Observer {
    @Override
    public void update(Object event) {
        System.out.println("Repeated string: " + event.toString());
    }
}
