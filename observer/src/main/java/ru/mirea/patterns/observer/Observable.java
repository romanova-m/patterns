package ru.mirea.patterns.observer;

public interface Observable {
    public void register(Observer observer);
    public void unRegister(Observer observer);
    public void notifyObservers(Object event);
}
