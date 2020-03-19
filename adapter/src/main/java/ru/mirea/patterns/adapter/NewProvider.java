package ru.mirea.patterns.adapter;

public class NewProvider {

    ProductContainer container = new ProductContainer();

    Product getProduct(int index){
        return container.getProduct(index);
    }

    int size() {
        return container.size();
    }
}
