package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(User user, Product product, int quantity) {
        System.out.println("Zamówienie użytkownika "+user.getName()+" "+user.getLastName()+" na "+quantity+" szt. produktu "+product.getName()+" zostało zapisane w bazie danych.");
        return true;
    }
}
