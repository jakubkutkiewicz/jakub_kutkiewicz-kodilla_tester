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
    public void timeTest () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes");
        Clock firstTime = context.getBean(Clock.class);
        Clock secondTime = context.getBean(Clock.class);
        Clock thirdTime = context.getBean(Clock.class);
        Assertions.assertEquals(firstTime.localTime, secondTime.localTime);
        Assertions.assertEquals(secondTime.localTime, thirdTime.localTime);
        Assertions.assertEquals(firstTime.localTime, thirdTime.localTime);

        System.out.println(firstTime.localTime);
        System.out.println(secondTime.localTime);
        System.out.println(thirdTime.localTime);


    }
        @Test
    public void differentTimeTest() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes");
        Clock firstTime = context.getBean(Clock.class);
        Thread.sleep(100);
        Clock secondTime = context.getBean(Clock.class);
        Thread.sleep(200);
        Clock thirdTime = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstTime.localTime,secondTime.localTime);
        Assertions.assertNotEquals(secondTime.localTime,thirdTime.localTime);
        Assertions.assertNotEquals(firstTime.localTime,thirdTime.localTime);


        System.out.println(firstTime.localTime);
        System.out.println(secondTime.localTime);
        System.out.println(thirdTime.localTime);


    }
}