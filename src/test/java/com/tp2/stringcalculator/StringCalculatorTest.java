package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    @Test
    void testEmptyStringReturnsZero() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    void testSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5, calculator.add("5"));
    }

    @Test
    void testTwoNumbersCommaSeparated() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(8, calculator.add("3,5"));
    }

    @Test
    void testMultipleNumbersWithNewlines() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(10, calculator.add("1\n2,3\n4"));
    }

    @Test
    void testNegativeNumberThrowsException() {
        StringCalculator calculator = new StringCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.add("2,-3,4");
        });
        assertTrue(exception.getMessage().contains("Número negativo no permitido"));
    }
}
//    Missing tests:
//
//- Empty string should return 0
//- Single number should return that number
//- Two numbers separated by comma should return their sum
//- Multiple numbers separated by comma should return their sum
//- Numbers separated by newline should work as delimiter
//- Negative numbers should throw IllegalArgumentException
}
