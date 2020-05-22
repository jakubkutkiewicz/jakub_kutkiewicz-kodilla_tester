package com.kodilla.inheritance.homework;

public class Pc extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("system is off");
    }

    public Pc(int year) {
        super(year);
        System.out.println(2010);
    }

}

