package ru.mirea.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class OldProvider implements ProductsProvider {

    @Override
    public List<Product> products() {
        return new ProductContainer().getProducts();
    }
}
