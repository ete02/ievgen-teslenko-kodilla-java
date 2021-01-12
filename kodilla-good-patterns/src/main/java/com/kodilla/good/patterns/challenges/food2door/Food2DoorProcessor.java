package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Food2DoorProcessor {
    private final List<Supplier> suppliersList;

    public Food2DoorProcessor(List<Supplier> suppliersList) {
        this.suppliersList = suppliersList;
    }

    // Map.compute(K key,BiFunction<? super K, super V,  extends V> remappingFunction)
    public void process(Food2DoorRequest newFoodRequest) {
        List<Supplier> supplierForEachProduct = computesuppliersList(newFoodRequest.getProductsNames());
        for (int i = 0; i < supplierForEachProduct.size(); i++) {
            FoodProduct product = newFoodRequest.getProductsList().get(i);
            int quantity = newFoodRequest.getProductsQuantities().get(i);
            supplierForEachProduct.get(i).process(product, quantity);
        }
    }
}
