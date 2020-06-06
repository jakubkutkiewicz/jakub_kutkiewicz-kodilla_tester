package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Triangle implements Shape {

    private double widht;
    private double height;
    private double hypotenuse;

    @Override
    public String toString() {
        return "Triangle{" +
                "widht=" + widht +
                ", height=" + height +
                ", hypotenuse=" + hypotenuse +
                '}';
    }

    public Triangle(double widht, double height, double hypotenuse) {
        this.widht = widht;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }


    @Override
    public double getArea() {
        return widht + height + hypotenuse;
    }

    @Override
    public double getPerimeter() {
        return widht * height/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.widht, widht) == 0 &&
                Double.compare(triangle.height, height) == 0 &&
                Double.compare(triangle.hypotenuse, hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(widht, height, hypotenuse);
    }
}


