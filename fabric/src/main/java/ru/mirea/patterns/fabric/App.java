package ru.mirea.patterns.fabric;

public class App {
    public static void main(String[] args) {
        System.out.println("I want to have round furniture!");
        Factory factory = new RoundFactory();
        Chair chair = factory.createChair();
        System.out.println("My chair says: " + chair.message());

        System.out.println("I want to have square furniture!");
        factory = new SquareFactory();
        chair = factory.createChair();
        System.out.println("My chair says: " + chair.message());
    }
}
