package ru.mirea.patterns.decorator;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Your PM asks to make low price products unavailable
 */
public class ProductPriceFilter extends ProductFilter {
    private ProductFilter wrappedFilter;

    ProductPriceFilter(ProductFilter wrappedFilter) {
        this.wrappedFilter = wrappedFilter;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        return wrappedFilter.filter(products).stream().filter(product -> product.price > 10).collect(Collectors.toList());
    }

}
