package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {


    public static void main(String[] args) {
        Random random = new Random();
      Car[] cars = new Car[random.nextInt(15) + 1];
      for (int i = 0; i < cars.length; i++)
        cars [i] = drawCar();
      for (Car car : cars)
          CarUtils.describeCar(car);
}

    public static Car drawCar() {
        Random random = new Random();
        int drawCarKind = random.nextInt(3);  //auta
        int c = random.nextInt(100) + 1; // predkosc
        if (drawCarKind == 0) {
            return new Ford(c);
        } else if (drawCarKind == 1) {
            ;
            return new Opel(c);
        } else
            return new Honda(c);
    }

}



