package com.kodilla.good.patterns.challenges.food2door;

public class OrderedProductsKey {
    private final String productName;
    private final int productQuantity;
    public OrderedProductsKey(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }
}
