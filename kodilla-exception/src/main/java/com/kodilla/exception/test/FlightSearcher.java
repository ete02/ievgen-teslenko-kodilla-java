package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearcher {
    private HashMap<String, Boolean> flightDestination = new HashMap<>();

    public HashMap<String, Boolean> addFlight(Flight flight) {
        flightDestination.put(flight.getArrivalAirport(), true);
        flightDestination.put(flight.getDepartureAirport(), true);

        return flightDestination;
    }

    public void searchFlight(String searchAirport) throws RouteNotFoundException {
        if (!flightDestination.containsKey(searchAirport)) {
            throw new RouteNotFoundException(searchAirport);
        }
        System.out.println("");
    }
}
