package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;
import java.util.function.Supplier;

public class Food2DoorRequest {
    private Supplier supplier;
    private foodName foodName;
    private int quantity;

    public Food2DoorRequest(Supplier supplier, foodName foodName, int quantity) {
        this.supplier = supplier;
        this.foodName = foodName;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public foodName getFoodName() {
        return foodName;
    }

    public int getQuantity() {
        return quantity;
    }
}