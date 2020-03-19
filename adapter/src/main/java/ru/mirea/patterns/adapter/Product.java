package ru.mirea.patterns.adapter;

public class Product {
    String description;

    Product(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
