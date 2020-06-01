package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
    private PrimeChecker checker = new PrimeChecker();
    private static int count = 0;

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        count++;
        boolean result = checker.isPrime(14);
        System.out.println("test number" + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        count++;
        System.out.println("test number" + count);
        boolean result = checker.isPrime(13);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        PrimeChecker checker = new PrimeChecker();
        count++;
        System.out.println("test number" + count);
        boolean result = checker.isPrime(2);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        PrimeChecker checker = new PrimeChecker();
        count++;
        System.out.println("test number" + count);
        boolean result = checker.isPrime(1);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        PrimeChecker checker = new PrimeChecker();
        count++;
        System.out.println("count" + count);
        boolean result = checker.isPrime(0);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        PrimeChecker checker = new PrimeChecker();
        count++;
        System.out.println("test number" + count);
        boolean result = checker.isPrime(-6);
        assertFalse(result);
    }
}
