package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        cars.add(new Ford(50));
        cars.remove(0);
        cars.add(new Honda(60));

        cars.add(new Opel(65));
        cars.remove(new Opel(65));


        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("rozmiar tablicy "+ cars.size());
    }
}