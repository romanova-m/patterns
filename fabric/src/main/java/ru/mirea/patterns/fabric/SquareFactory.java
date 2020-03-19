package ru.mirea.patterns.fabric;

public class SquareFactory extends Factory {
    @Override
    Chair createChair() {
        return Chair.createChair("square");
    }

    @Override
    Table createTable() {
        return Table.createTable("square");
    }
}
