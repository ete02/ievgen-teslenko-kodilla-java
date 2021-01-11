package com.kodilla.good.patterns.challenges.orderservice;

public interface InformationService {
    void inform(User user);
    //enum (mail, sms, ...) czyli to wszystko, jakie media dostepne
    //interfejs contactData zamiast User - w zaleznosci od tego mozna wysylac sms, mail....
    // validation - czyli tylko raz zwaliduje ilosc
}
