package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaIsUse = airportRepository.isAirportsinUse("Vienna");
            System.out.println("Vienna status" + isViennaIsUse);
        } catch (AirportNotFoundException e) {
            System.out.println("sorry this airport cannot be served");
        } finally {
            System.out.println("Thank you for using Kodilla airlines");
        }
    }
}

