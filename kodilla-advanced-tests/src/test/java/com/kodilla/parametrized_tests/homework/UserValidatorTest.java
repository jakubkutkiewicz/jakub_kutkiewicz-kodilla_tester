package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    public UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aa2", "ssss3", "sAA"})
    public void userValidator(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"jakubkutiewicz@gmail.com","j@wp.pl"})
    public void emailValidator(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }


}