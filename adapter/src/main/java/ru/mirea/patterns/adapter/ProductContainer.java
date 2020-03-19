package ru.mirea.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class ProductContainer {
    private List<Product> products = new ArrayList<Product>() {{
        add(new Product("1"));
        add(new Product("2"));
        add(new Product("3"));
    }};

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(int index) {
        return products.get(index);
    }

    public int size() {
        return products.size();
    }
}
