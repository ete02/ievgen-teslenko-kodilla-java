package com.kodilla.good.patterns.challenges.orderservice;

public class Product {
    private final String name;
    private final int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}