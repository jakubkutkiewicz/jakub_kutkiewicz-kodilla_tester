package com.kodilla.exception;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportRepositoryTest {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {

        AirportRepository airportRepository = new AirportRepository();


        boolean isWarsawInUse = airportRepository.isAirportsinUse("Warsaw");
        assertTrue(isWarsawInUse);

    }

    @Test(expected = AirportNotFoundException.class)
    public void testIsAirportInUse1() throws AirportNotFoundException {

        AirportRepository airportRepository = new AirportRepository();


        boolean isWarsawInUse = airportRepository.isAirportsinUse("Vienna");
        assertTrue(isWarsawInUse);

    }

}