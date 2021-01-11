package com.kodilla.good.patterns.challenges.orderservice;

public class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(User user, Product product, int quantity) {
        System.out.println("User Order "+user.getName()+" "+user.getLastName()+" for "+quantity
                +" qua. product "+product.getName()+" has been saved in the database.");
        return true;
    }
}
