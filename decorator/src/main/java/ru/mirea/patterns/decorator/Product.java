package ru.mirea.patterns.decorator;

/**
 * class for simple business product, could be taken from dao
 */
public class Product {
    boolean available;
    boolean stable;
    int price;

    Product(boolean available, boolean stable, int price) {
        this.available = available;
        this.stable = stable;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ available " + available + ", stable " + stable + ", price " + price + " }\t";
    }
}
