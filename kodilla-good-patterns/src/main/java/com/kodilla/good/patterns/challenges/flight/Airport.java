package com.kodilla.good.patterns.challenges.flight;

public class Airport {
    private final String name;
    private final String abbrev;

    public Airport(String name, String abbrev) {
        this.name = name;
        this.abbrev = abbrev;
    }

    public String getName() {
        return name;
    }

    public String getAbbrev() {
        return abbrev;
    }
}

