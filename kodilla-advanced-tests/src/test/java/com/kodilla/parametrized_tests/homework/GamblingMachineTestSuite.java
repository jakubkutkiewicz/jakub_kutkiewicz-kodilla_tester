package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamingNumbers.csv")
    public void howManyWinsTest(int one, int two, int three, int four, int five, int six, int seven, int eight, int nine) throws InvalidNumbersException {
        Set<Integer> input = new HashSet<>();
        input.add(one);
        input.add(two);
        input.add(three);
        input.add(four);
        input.add(five);
        input.add(six);
        input.add(seven);
        input.add(eight);
        input.add(nine);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(input));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamingNumbers.csv")
    public void validateNumberTest(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> input = new HashSet<>();
        input.add(one);
        input.add(two);
        input.add(three);
        input.add(four);
        input.add(five);
        input.add(six);

        assertTrue(gamblingMachine.howManyWins(input) >= 0 && gamblingMachine.howManyWins(input) <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongGamingNumbers.csv")
    public void howManyFailTest(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> input = new HashSet<>();
        input.add(one);
        input.add(two);
        input.add(three);
        input.add(four);
        input.add(five);
        input.add(six);


        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(input));

    }
}