package com.kodilla.good.patterns.challenges.orderservice;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Wysyłam powiadomienie o realizacji zamowienia do " + user.getName() + " " + user.getLastName() + ".");
    }
}