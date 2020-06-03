package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford(50);
        showCarDetails(ford);
        doRace(ford);

        Opel opel = new Opel(50);
        showCarDetails(opel);
        doRace(opel);

        Honda honda = new Honda(50);
        showCarDetails(honda);
        doRace(honda);
    }


    private static void showCarDetails(Car car) {
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());

    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());

    }
}


