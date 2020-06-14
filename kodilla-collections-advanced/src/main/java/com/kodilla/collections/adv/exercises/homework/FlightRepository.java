package com.kodilla.collections.adv.exercises.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warszawa", " Londyn"));
        flightList.add(new Flight("Londyn", " Nowy Jork"));
        flightList.add(new Flight("Warszawa", "Tokio"));
        flightList.add(new Flight("Tokio", "Warszawa"));
        return flightList;

    }
}

