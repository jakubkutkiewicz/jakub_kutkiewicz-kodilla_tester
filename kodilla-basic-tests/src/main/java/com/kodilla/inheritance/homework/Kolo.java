package com.kodilla.inheritance.homework;

public class Kolo extends Shape {
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double pole() {
        return r*r*3.14;
    }

    @Override
    public double obwod() {
        return 2*r*3.14;
    }
}
