package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    RouteNotFoundException(String airport) {
        // metoda super pozwoli mi wywołać konstruktor klasy nadrzędnej (tej, z której dziedziczymy)
        super("Airport: '" + airport + "' - not found.");
    }
}
