package com.kodilla.inheritance.homework;

public class Laptop extends OperatingSystem{



    public void turnOff() {
        System.out.println("system is on");
    }

    public Laptop(int year) {
        super(year);

    }
}




