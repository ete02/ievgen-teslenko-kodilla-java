package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    protected String supplierName;
    protected final List<FoodProduct> availableProducts = new ArrayList<>();

    public void process(FoodProduct product, int quantity) {
        System.out.println("Product: " + product + "quantity: " + quantity);
    }

    ;

    public void addAvailableProduct(FoodProduct newProduct) {
        availableProducts.add(newProduct);
    }

    public boolean canDeliver(String name) {
        return availableProducts.stream().anyMatch(e -> e.getName().equals(name));
    }
}
