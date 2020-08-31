package com.kodilla.jacoco;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4() {

        //given
        Year year = new Year(4);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
    @Test
    public void shouldBeLeapYearIfDivisibleBy4and100() {

        //given
        Year year = new Year(200);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }
        @Test
        public void shouldntBe() {

            //given
            Year year = new Year(1333);

            //when
            boolean isLeapYear = year.isLeap();

            //then
            assertFalse(isLeapYear);
}
}