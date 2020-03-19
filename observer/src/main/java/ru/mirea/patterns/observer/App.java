package ru.mirea.patterns.observer;

public class App {
    public static void main(String[] args) {
        Observable observable = new TextBot();
        observable.notifyObservers("Hello!"); // nothing happens

        observable.register(new Greeter());
        Observer leaver = new Repeater();
        observable.register(leaver);
        observable.notifyObservers("Hello!");

        observable.unRegister(leaver);
    }
}
