package com.kodilla.good.patterns.challenges.food2door;
import java.util.Objects;

public class FoodProduct {
    private String foodName;

    public FoodProduct(String foodName) {
        this.foodName = foodName;
    }

    public String getItemName() {
        return foodName;
    }
}