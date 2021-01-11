package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderApp {
    public static void main(String[] args){
        FoodOrderRetriever foodOrderRetrieverOrderRequestRetriever= new FoodOrderRetriever();
        Food2DoorRequest food2DoorRequest=foodOrderRetrieverOrderRequestRetriever.retrieve();
        Food2DoorProcessor food2DoorProcessor =new Food2DoorProcessor(Food2DoorRequest.getSupplier());
        FoodOrderingProc.getfoodOrderingProc().process(food2DoorRequest.getSupplier(),food2DoorRequest.getFoodName());
    }
}
