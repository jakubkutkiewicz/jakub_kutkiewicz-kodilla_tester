package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {
    @Test
    public void checkAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        double add = bean.add(2, 2);
        Assertions.assertEquals(4, 4);
    }

    @Test
    public void checkSubtrack() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        double subtrack = bean.subtract(10, 5);
        Assertions.assertEquals(5, 5);

    }
    @Test
    public void checkMultiply(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        double multiply = bean.multiply(2,2);
        Assertions.assertEquals(4,4);
    }
    @Test
    public void checkDivide(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        double divide = bean.divide(2,2);
        Assertions.assertEquals(1,1);
    }
}
