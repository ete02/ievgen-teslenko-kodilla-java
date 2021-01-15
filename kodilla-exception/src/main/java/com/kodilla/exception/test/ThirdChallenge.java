package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void main(String[] args) throws RouteNotFoundException {
        FlightSearcher thirdChallenge = new FlightSearcher();
        Flight myFlight1 = new Flight("Warsaw", "Paris");
        Flight myFlight2 = new Flight("Warsaw", "Berlin");
        Flight myFlight3 = new Flight("Berlin", "New-York");
        try {
            thirdChallenge.findFlight(myFlight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try {
            thirdChallenge.findFlight(myFlight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try {
            thirdChallenge.findFlight(myFlight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}