package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {



    @Test
    public void flightFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightFrom = new ArrayList<>();
        flightFrom.add(new Flight("Tokio", "Warszawa"));
        List<Flight> thisFlight = flightFinder.findFlightsFrom("Tokio");
        assertEquals(flightFrom, thisFlight);

    }
    @Test
    public void flightTo(){
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightTo = new ArrayList<>();
        flightTo.add(new Flight("Warszawa","Tokio"));
        List<Flight> thisFlight = flightFinder.findFlightsTo("Tokio");
        assertEquals(flightTo,thisFlight);

    }


}