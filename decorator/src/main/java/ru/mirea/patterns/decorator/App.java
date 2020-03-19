package ru.mirea.patterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ProductFilter filter = new ProductFilter();

        List<Product> products = new ArrayList<>();
        products.add(new Product(true, true, 5));
        products.add(new Product(true, true, 20));
        products.add(new Product(true, true, 30));
        products.add(new Product(true, false, 20));
        products.add(new Product(false, true, 20));

        System.out.println("Base class filter: " + filter.filter(products));
        filter = new ProductPriceFilter(filter);
        System.out.println("With prices filter: " + filter.filter(products));
    }
}
