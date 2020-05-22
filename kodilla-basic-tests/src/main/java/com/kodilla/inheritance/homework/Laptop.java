package com.kodilla.inheritance.homework;

public class Laptop extends OperatingSystem{

    public Laptop(int year) {
        super(year);
        System.out.println(2004);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
