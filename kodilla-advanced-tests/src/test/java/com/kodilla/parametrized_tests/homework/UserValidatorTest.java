package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    public UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"ubb"})
    public void userValidator(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa", "3", "aaa300"})
    public void negativeUserValidator(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"jakubkutiewicz@gmail.com", "j@wp.pl"})
    public void emailValidator(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);



    }

    @ParameterizedTest
    @ValueSource(strings = {"@@gmail.com", "ss@wppl", "@wp.pl", "111", "@@", "+-@wp.pl", "kuba@11.11,", "111.11.PL"})
    public void negativeEmailValidator(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }


}