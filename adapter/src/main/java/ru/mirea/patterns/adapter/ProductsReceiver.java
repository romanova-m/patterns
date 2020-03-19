package ru.mirea.patterns.adapter;

import java.util.List;

public class ProductsReceiver {
    void doSomeLogic(List<Product> products) {
        System.out.println("I have products: ");
        products.forEach(product -> System.out.println(product.description + "\t"));
    }
}
