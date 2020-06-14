package com.kodilla.collections.adv.exercises.homework;


import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Flight {
    String departure;
    String arrival;


    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) &&
                Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }
}
