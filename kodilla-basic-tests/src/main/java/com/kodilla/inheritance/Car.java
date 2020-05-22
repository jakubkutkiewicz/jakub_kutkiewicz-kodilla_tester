package com.kodilla.inheritance;

public class Car {

        private int wheels;

    public int getWheels() {
        return wheels;
    }

    private int seats;

    public int getSeats() {
        return seats;
    }

    public void turnOnLights() {
            System.out.println("Lights were turned on");
        }
    public void openDoors() {
        System.out.println("Opening 4 doors");
    }

    public Car(int wheels, int seats) {
            this.seats =seats;
            this.wheels=wheels;

        System.out.println("Car constructor");
    }
    public void displayNumberofSeats(){
        System.out.println("number of seats: "  + seats);

    }

    }




