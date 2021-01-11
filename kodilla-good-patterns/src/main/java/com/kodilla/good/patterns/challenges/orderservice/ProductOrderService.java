package com.kodilla.good.patterns.challenges.orderservice;

public class ProductOrderService implements OrderService {
    private final ProductOrderRepository productOrderRepository = new ProductOrderRepository();

    public boolean order(final User user, final Product product, final int quantity) {
        if (productOrderRepository.createOrder(user, product, quantity)) {
            System.out.println("User"+user.getName()+" create order for "+quantity+" qua. "+product.getName());
            return true;
        } else {
            System.out.println("Saving error. Try again");
            return false;
        }
    }
}