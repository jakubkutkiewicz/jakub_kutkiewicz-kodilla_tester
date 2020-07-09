package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Dog;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConfigCarTest {


    @Test
    public void configCarTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("createCar");
        String carType = car.getCarType();
        System.out.println(carType);

        List<String> possibleCars = Arrays.asList("SEDAN", "SUV", "CABRIO");
        Assertions.assertTrue(possibleCars.contains(carType));
    }



    @Test
    public void testLights() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("createCar");
        boolean checkLights = car.hasHeadlightsTurnedOn();
        assertFalse(checkLights);
    }
}
