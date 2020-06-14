package com.kodilla.collections.adv.exercises.homework;


import java.util.*;

public class FlightFinder {
    Map<String, List<Flight>> flight = new HashMap<>();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightFrom = new ArrayList<>();
        List<Flight> allflights = FlightRepository.getFlightsTable();
        for (Flight flight : allflights) {
            if (flight.getDeparture().equals(departure)) {
                flightFrom.add(flight);
            }

        }
        return flightFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightTo = new ArrayList<>();
        List<Flight> allflights = FlightRepository.getFlightsTable();
        for (Flight flight : allflights) {
            if (flight.getArrival().equals(arrival)) {
                flightTo.add(flight);
            }
        }
        return flightTo;
    }
}