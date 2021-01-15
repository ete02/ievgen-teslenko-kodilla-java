package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindFlightService {
    private final List<Flight> flightsList = new ArrayList<>();

    public void addFlight(Airport from, Airport to, List<Airport> stops) {
        flightsList.add(new Flight(from, to, stops));
    }

    public void findAllFlightsFrom(Airport departure) {
        System.out.println("Searching all flight departure from " + departure.getName() + " (" + departure.getAbbrev() + ").");
        flightsList.stream().filter(e -> e.getDeparture().equals(departure)).forEach(System.out::println);
    }

    ;

    public void findAllFlightsTo(Airport destination) {
        System.out.println("Searching all flights to the " + destination.getName() + " (" + destination.getAbbrev() + ").");
        flightsList.stream().filter(e -> e.getDestination().equals(destination)).forEach(System.out::println);
    }

    ;

    public void findAllFlightsFromWithStopover(Airport departure, List<Airport> stopover) {
        System.out.println("Searching all flights depature from  " + departure.getName() + " (" + departure.getAbbrev()
                + "), with stopover.");
        for (int i = 0; i < stopover.size(); i++) {
            int finalI = i;
            flightsList.stream().filter(e -> (e.getDeparture().equals(departure)) && (e.getStopsList() != null)).
                    collect(Collectors.toList()).stream().
                    filter(e -> e.getStopsList().
                            contains(stopover.get(finalI))).forEach(System.out::println);
        }
    }
}
