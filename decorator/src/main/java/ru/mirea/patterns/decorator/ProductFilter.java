package ru.mirea.patterns.decorator;

import java.util.List;
import java.util.stream.Collectors;

/**
 * filters available products for client
 */
public class ProductFilter {
    public List<Product> filter(List<Product> products) {
        return products.stream().filter(product -> product.stable && product.available).collect(Collectors.toList());
    }
}
