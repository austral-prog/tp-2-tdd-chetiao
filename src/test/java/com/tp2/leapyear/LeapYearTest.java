package com.tp2.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

    @Test
    void testAnoBisiestoDivisiblePor400() {
        assertEquals(true, LeapYear.isLeapYear(2000));
    }

    @Test
    void testAnoNoBisiestoDivisiblePor100PeroNoPor400() {
        assertEquals(false, LeapYear.isLeapYear(1900));
    }

    @Test
    void testAnoBisiestoDivisiblePor4PeroNoPor100() {
        assertEquals(true, LeapYear.isLeapYear(2024));
    }

    @Test
    void testAnoNoBisiestoNoDivisiblePor4() {
        assertEquals(false, LeapYear.isLeapYear(2023));
    }

    @Test
    void testAnoConNumeroNegativo() {
        assertEquals(false, LeapYear.isLeapYear(-2024));
    }
}

//    Missing tests:
//
//- A year is a leap year if it is divisible by 4
//- A year is not a leap year if it is divisible by 100
//- A year is a leap year if it is divisible by 400
}
