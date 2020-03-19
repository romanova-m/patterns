package ru.mirea.patterns.observer;

import java.util.ArrayList;
import java.util.HashMap;

public class TextBot implements Observable {
    ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object event) {
        observers.forEach(observer -> observer.update(event));
    }

    public void sendMessage(String message) {
        notifyObservers(message);
    }
}
