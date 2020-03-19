package ru.mirea.patterns.fabric;

public class RoundFactory extends Factory {
    @Override
    Chair createChair() {
        return Chair.createChair("round");
    }

    @Override
    Table createTable() {
        return Table.createTable("round");
    }
}
