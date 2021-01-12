package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop extends Supplier {
    public HealthyShop() {
        supplierName = "HealthyShop";
    }

    @Override
    public void process(FoodProduct product, int quantity) {
        System.out.println("Order for:" + product + "quantity" + quantity + " from HealthyShop");
    }
}
