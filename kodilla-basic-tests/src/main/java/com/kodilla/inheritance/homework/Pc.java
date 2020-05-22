package com.kodilla.inheritance.homework;

public class Pc extends OperatingSystem {


    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public Pc(int year) {
        super(year);
        System.out.println(2010);
    }

}

