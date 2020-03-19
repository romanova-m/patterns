package ru.mirea.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Adapter implements ProductsProvider {
    NewProvider newProvider;

    Adapter(NewProvider provider) {
        this.newProvider = provider;
    }

    @Override
    public List<Product> products() {
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < newProvider.size(); i++) {
            result.add(newProvider.getProduct(i));
        }
        return result;
    }
}
