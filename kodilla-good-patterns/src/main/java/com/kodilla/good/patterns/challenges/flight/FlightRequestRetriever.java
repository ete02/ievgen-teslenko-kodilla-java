package com.kodilla.good.patterns.challenges.flight;

public class FlightRequestRetriever {

    public FlightRequest retrieve() {
        String departureAirport = "Warsaw";
        String arriveAirport = "Berlin";
        return new FlightRequest(departureAirport, arriveAirport);
    }
}
