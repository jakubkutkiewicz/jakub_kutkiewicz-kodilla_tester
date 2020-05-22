package com.kodilla.inheritance.homework;

public class OperatingSystem {
private int year;
private double version;

    public void turnOn(){ System.out.println("system turn on"); }
    public void turnOff () { System.out.println("system turn off"); }

    public OperatingSystem (int year){
this.year = year;

        System.out.println("rok systemu operacyjnego : " );
    }



}

