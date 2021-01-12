package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop extends Supplier {
    public GlutenFreeShop() {
        supplierName = "GlutenFreeShop";
        }
        @Override
        public void process(FoodProduct product, int quantity) {
            System.out.println("Order for:" + product + "quantity" + quantity + " from GlutenFreeShop");
        }
}
