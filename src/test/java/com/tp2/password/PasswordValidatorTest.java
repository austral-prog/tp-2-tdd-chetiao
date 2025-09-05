package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringCalculatorTest {

    @Test
    void testCadenaVaciaDevuelveCero() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    void testUnSoloNumeroDevuelveElMismoNumero() {
        assertEquals(5, StringCalculator.add("5"));
    }

    @Test
    void testDosNumerosSeparadosPorComa() {
        assertEquals(8, StringCalculator.add("3,5"));
    }

    @Test
    void testMultiplesNumerosSeparadosPorComa() {
        assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    }

    @Test
    void testNumerosConSaltosDeLinea() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    void testNumeroNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("1,-2,3");
        });
    }

    @Test
    void testMultiplesNumerosNegativosLanzaExcepcion() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("-1,2,-3");
        });
        assertEquals("Número negativo no permitido: -1", exception.getMessage());
    }
}

//    Missing tests:
//
//- Password with less than 8 characters should be invalid
//- Password with 8 or more characters should pass length validation
//- Password without uppercase letter should be invalid
//- Password without lowercase letter should be invalid
//- Password without number should be invalid
//- Password without special character should be invalid
//- Password meeting all criteria should be valid
}
