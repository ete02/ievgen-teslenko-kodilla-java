package com.kodilla.good.patterns.challenges.food2door;

public class Food2DoorProcessor {
    private FoodOrderingProc productOrderingProc;

    public Food2DoorProcessor(FoodOrderingProc productOrderingProc) {
        this.productOrderingProc = productOrderingProc;
    }

    public FoodOrderingProc getProductOrderingProc() {
        return productOrderingProc;
    }
}