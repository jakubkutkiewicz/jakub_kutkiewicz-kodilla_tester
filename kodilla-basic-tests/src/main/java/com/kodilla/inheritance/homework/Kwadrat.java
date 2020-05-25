package com.kodilla.inheritance.homework;


public class Kwadrat extends Shape {


    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    public double pole() {
        return a * a;
    }

    public double obwod() {
        return 4 * a;
    }


}




