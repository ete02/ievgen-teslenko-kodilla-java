package com.kodilla.good.patterns.challenges.orderservice;

public interface OrderRepository {
    boolean createOrder(User user, Product product, int quantity);
}
