package com.kodilla.inheritance.homework;

public class Pc extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("system is off");
    }

    public void turnOff() {
        System.out.println("system is on");
    }

    public Pc(int year) {
        super(year);

    }

}

