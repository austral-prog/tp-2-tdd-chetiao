package com.tp2.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {
    @Test
    void testDivisiblePor400() {
        assertTrue(new LeapYear().isLeap(2000));
    }

    @Test
    void testDivisiblePor100No400() {
        assertFalse(new LeapYear().isLeap(1900));
    }

    @Test
    void testDivisiblePor4No100() {
        assertTrue(new LeapYear().isLeap(2004));
    }

    @Test
    void testNoDivisiblePor4() {
        assertFalse(new LeapYear().isLeap(2001));
    }
}