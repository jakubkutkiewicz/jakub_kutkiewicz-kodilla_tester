package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.dodawanie(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void test() {
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 0;

        int sumResult = calculator.dodawanie(a, b);
        assertEquals(0, sumResult);


        int minusResult = calculator.odejmowanie(a, b);
        assertEquals(0, minusResult);
    }


    @Test
    public void test2() {
        Calculator calculator = new Calculator();
        int a = -2;
        int b = 2;
        double power = Math.pow(a, b);
        double potega = calculator.power;
        assertEquals(4,power);

    }
}


