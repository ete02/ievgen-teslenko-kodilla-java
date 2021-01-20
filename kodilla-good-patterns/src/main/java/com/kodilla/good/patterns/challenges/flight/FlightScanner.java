package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightScanner implements FlightService {
    private final List<Flight> flights;

    public FlightScanner() {
        this.flights = createFlights();
    }

    @Override
    public List<Flight> findFlightFrom(FlightRequest flightRequest) {
        return flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(flightRequest.getDepartureAirport()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findFlightTo(FlightRequest flightRequest) {
        return flights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(flightRequest.getArrivalAirport()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findFlightDirect(FlightRequest flightRequest) {
        return flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(flightRequest.getDepartureAirport()) && flight.getArrivalAirport().equals(flightRequest.getArrivalAirport()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findFlightWithChanges(FlightRequest flightRequest) {
        List<Flight> flightsFrom = flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(flightRequest.getDepartureAirport()))
                .collect(Collectors.toList());
        List<Flight> flightsTo = flights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(flightRequest.getArrivalAirport()))
                .collect(Collectors.toList());
        List<Flight> flightsTransfers = new ArrayList<>();
        for (Flight flightFrom : flightsFrom) {
            flightsTo.stream()
                    .filter(flightTo -> flightTo.getDepartureAirport().equals(flightFrom.getArrivalAirport()))
                    .forEach(flightTo -> {
                        flightsTransfers.add(flightFrom);
                        flightsTransfers.add(flightTo);
                    });
        }
        return flightsTransfers;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    private List<Flight> createFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Krakow ", "Wroclaw"));
        flights.add(new Flight("Krakow", "Oslo"));
        flights.add(new Flight("Oslo", "Wroclaw Airport"));
        flights.add(new Flight("New-York", "Warsaw"));
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Warsaw", "Oslo"));

        return flights;
    }
}
