package com.kodilla.good.patterns.challenges;

public interface InformationService {
    void inform(User user);
    //enum (mail, sms, ...)
    //interfejs contactData zamiast User - w zaleznosci od tego mozna wysylac sms, mail....
}
