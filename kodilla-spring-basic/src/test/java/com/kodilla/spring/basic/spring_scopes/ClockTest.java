package com.kodilla.spring.basic.spring_scopes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTest {


    @Test
    public void DateTest () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes");
        Clock firstTime = context.getBean(Clock.class);
        Clock secondTime = context.getBean(Clock.class);
        Clock thirdTime = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstTime,secondTime);
        Assertions.assertNotEquals(secondTime,thirdTime);
        Assertions.assertNotEquals(firstTime,thirdTime);
    }
}