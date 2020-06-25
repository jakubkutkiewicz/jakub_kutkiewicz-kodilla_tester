

package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    private static Stream<Arguments> sourcesForPerson() {
        return Stream.of(
                Arguments.of(1.80, 80,"Normal (healthy weight)"),
                Arguments.of(1.50, 80,"Obese Class II (Severely obese)"),
                Arguments.of(1.60, 70,"Overweight"),
                Arguments.of(1.90, 60,"Underweight"),
                Arguments.of(1.20, 80,"Obese Class V (Super Obese)"),
                Arguments.of(1.55, 45,"Normal (healthy weight)")
        );

    }
}

