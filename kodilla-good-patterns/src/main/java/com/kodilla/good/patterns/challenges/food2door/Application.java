package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {

        DeliveryRequest deliveryRequest = new DeliveryRequest
                ("Extra Food Shop", "orange", 5, "kg");

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
        deliveryProcessor.order(deliveryRequest);

    }
}

