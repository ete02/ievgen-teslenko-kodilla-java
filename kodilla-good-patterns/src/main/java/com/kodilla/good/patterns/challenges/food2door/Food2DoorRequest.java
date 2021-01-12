package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Food2DoorRequest {
    private final OrderedProducts orderedProducts = new OrderedProducts();

    public void addToOrder(FoodProduct product, int quantity) {
        orderedProducts.add(product, quantity);
    }

    public List<String> getProductsNames() {
        return orderedProducts.getProductsNamesList();
    }

    public List<Integer> getProductsPriceList() {
        return orderedProducts.getProductsPriceList();
    }

    public List<Integer> getProductsQuantities() {
        return orderedProducts.getProductsQuantitiesList();
    }

    public List<FoodProduct> getProductsList() {
        return orderedProducts.getProductsList();
    }
}
