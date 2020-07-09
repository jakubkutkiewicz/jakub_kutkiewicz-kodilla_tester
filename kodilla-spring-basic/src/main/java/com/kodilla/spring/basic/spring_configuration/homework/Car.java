package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDateTime;

public interface Car {


    default boolean hasHeadlightsTurnedOn() {
        LocalDateTime date = LocalDateTime.now();

        if ((date.getHour() > 20) || (date.getHour() > 0 && date.getHour() < 6)) {

            System.out.println("TURN ON LIGHTS");
            return true;
        } else {

            System.out.println("TURN OFF LIGHTS");
            return false;
        }

    }

    public String getCarType();
}