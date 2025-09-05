package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    @Test
    void testNumeroUno() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("I", roman.convert(1));
    }

    @Test
    void testNumeroCinco() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("V", roman.convert(5));
    }

    @Test
    void testNumeroDiez() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("X", roman.convert(10));
    }

    @Test
    void testNumeroCuatro() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("IV", roman.convert(4));
    }

    @Test
    void testNumeroNueve() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("IX", roman.convert(9));
    }

    @Test
    void testNumeroComplejo() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("MCMXCIV", roman.convert(1994));
    }

    @Test
    void testOtroNumeroComplejo() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("LIV", roman.convert(54));
    }

    @Test
    void testNumeroMaximo() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("MMMCMXCIX", roman.convert(3999));
    }

    @Test
    void testNumeroCero() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("", roman.convert(0));
    }

    @Test
    void testNumeroNegativo() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("", roman.convert(-1));
    }
}

//    Missing tests:
//
//- Convert 1 to "I"
//- Convert 5 to "V"
//- Convert 10 to "X"
//- Convert 4 to "IV" (subtraction case)
//- Convert 9 to "IX" (subtraction case)
//- Convert 40 to "XL"
//- Convert 50 to "L"
//- Convert 90 to "XC"
//- Convert 100 to "C"
//- Convert 400 to "CD"
//- Convert 500 to "D"
//- Convert 900 to "CM"
//- Convert 1000 to "M"
//- Convert complex numbers like 1994 to "MCMXCIV"
}
