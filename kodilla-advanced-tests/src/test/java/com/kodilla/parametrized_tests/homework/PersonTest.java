package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {


   @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#sourcesForPerson")
    public void bmiTest(double heightInMeters, double weightInKilogram, String status) {
       Person person = new Person(heightInMeters, weightInKilogram);
       assertEquals(status, person.getBMI());

   }}