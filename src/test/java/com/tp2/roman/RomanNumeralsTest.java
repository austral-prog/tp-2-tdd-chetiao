package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {
    private final RomanNumerals converter = new RomanNumerals();

    @Test
    void testBasicNumbers() {
        assertEquals("I", converter.convert(1));
        assertEquals("V", converter.convert(5));
        assertEquals("X", converter.convert(10));
    }

    @Test
    void testSubtractiveCases() {
        assertEquals("IV", converter.convert(4));
        assertEquals("IX", converter.convert(9));
    }

    @Test
    void testMediumNumbers() {
        assertEquals("XL", converter.convert(40));
        assertEquals("L", converter.convert(50));
        assertEquals("XC", converter.convert(90));
        assertEquals("C", converter.convert(100));
    }

    @Test
    void testLargeNumbers() {
        assertEquals("CD", converter.convert(400));
        assertEquals("D", converter.convert(500));
        assertEquals("CM", converter.convert(900));
        assertEquals("M", converter.convert(1000));
    }

    @Test
    void testComplexNumbers() {
        assertEquals("MCMXCIV", converter.convert(1994));
        assertEquals("MMXXIII", converter.convert(2023));
    }
}