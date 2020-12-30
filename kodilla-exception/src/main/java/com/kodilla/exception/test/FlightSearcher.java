package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearcher {
    private HashMap<String, Boolean> flightDestination = new HashMap<>();

    public FlightSearcher() {
        flightDestination.put("Warsaw", true);
        flightDestination.put("Cracow", true);
        flightDestination.put("Wroclaw", true);
        flightDestination.put("Lublin", false);

    }

    public void  findFlight(Flight flight) throws RouteNotFoundException {
        /*
        if (!flightDestination.containsKey(searchAirport)) {
            throw new RouteNotFoundException(searchAirport);
        }
        System.out.println("");*/
        String arrivalAirport = flight.getArrivalAirport();
        Boolean aBoolean = flightDestination.get(arrivalAirport);
        if (!aBoolean) throw new RouteNotFoundException(arrivalAirport);

    }
}
