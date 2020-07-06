package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
public class Display {


    public void display(double value) {
        System.out.println(value);
    }
}
