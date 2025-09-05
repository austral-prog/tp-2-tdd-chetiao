package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void testTooShort() {
        assertFalse(validator.isValid("abc"));
    }

    @Test
    void testMissingUppercase() {
        assertFalse(validator.isValid("abcdefgh1!"));
    }

    @Test
    void testMissingLowercase() {
        assertFalse(validator.isValid("ABCDEFGH1!"));
    }

    @Test
    void testMissingNumber() {
        assertFalse(validator.isValid("Abcdefgh!"));
    }

    @Test
    void testMissingSpecialChar() {
        assertFalse(validator.isValid("Abcdefg1"));
    }

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Abcdefg1!"));
    }
}
