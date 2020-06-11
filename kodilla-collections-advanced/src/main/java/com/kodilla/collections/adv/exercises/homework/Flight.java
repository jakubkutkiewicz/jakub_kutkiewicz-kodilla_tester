package com.kodilla.collections.adv.exercises.homework;


import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {
    String departure;
    String arrival;




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
