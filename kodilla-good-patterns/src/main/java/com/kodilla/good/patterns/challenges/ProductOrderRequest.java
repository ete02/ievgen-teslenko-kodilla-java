package com.kodilla.good.patterns.challenges;

public class ProductOrderRequest implements OrderRequest {
    public ProductOrderRequest(User user, Product product, int quantity, String from) {
        this.user = user;
        this.product = product;
        this.quantity = 15;
    }

    private final User user;
    private final Product product;
    private final int quantity;

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}