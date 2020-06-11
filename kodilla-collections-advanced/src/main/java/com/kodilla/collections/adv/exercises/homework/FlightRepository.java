package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flightList = new ArrayList<>();
        Flight flight1 = new Flight("Warszawa", " Londyn");
        Flight flight2 = new Flight("Warszawa", " Nowy Jork");
        Flight flight3 = new Flight("Warszawa", "Tokio");

        return flightList;
    }
    }

