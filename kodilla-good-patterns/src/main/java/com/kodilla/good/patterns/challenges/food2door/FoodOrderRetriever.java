package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.ProductOrderRequest;

public class FoodOrderRetriever {
    public Food2DoorRequest retrieve() {
        FoodProduct foodName1 = new FoodProduct("Mięta");
        Supplier supplier1 = new Supplier("ExtraFoodShop");
        return new ProductOrderRequest(user,supplier1, foodName1, 10);
    }
}