package ru.mirea.patterns.fabric;

public class Table {
    static Table createTable(String type) {
        switch (type) {
            case "round": return new RoundTable();
            default: return new SquareTable();
        }
    }
}
