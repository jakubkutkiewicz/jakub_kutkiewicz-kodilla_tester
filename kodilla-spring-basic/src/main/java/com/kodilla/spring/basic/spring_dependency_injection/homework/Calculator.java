package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {


    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }


    double add(double a, double b) {
        double add = a + b;
        this.display.display(add);
        return add;
    }

    double subtract(double a, double b) {
        double subtrack = a - b;
        this.display.display(subtrack);
        return subtrack;
    }

    double multiply(double a, double b) {
        double multiply = a * b;
        this.display.display(multiply);
        return multiply;
    }

    double divide(double a, double b) {
        double divide = a / b;
        this.display.display(divide);
        return divide;

    }

}
