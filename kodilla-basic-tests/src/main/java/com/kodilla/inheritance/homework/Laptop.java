package com.kodilla.inheritance.homework;

public class Laptop extends OperatingSystem {


    public void turnOn() {
        System.out.println("system is turn off");
    }

    public void turnOff() {
        System.out.println("system is on");
    }


    public Laptop(int year) {
        super(year);

    }
}




