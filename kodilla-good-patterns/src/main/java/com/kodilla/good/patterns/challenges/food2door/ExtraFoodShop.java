package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop extends Supplier {
    public ExtraFoodShop() {
        supplierName = "ExtraFoodShop";
    }

    @Override
    public void process(FoodProduct product, int quantity) {
        System.out.println("Order for:" + product + "quantity" + quantity + " from ExtraFoodShop");
    }
}
