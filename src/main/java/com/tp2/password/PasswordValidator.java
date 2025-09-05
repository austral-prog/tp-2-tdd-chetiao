package com.tp2.password;

public class PasswordValidator {
    
    public boolean isValid(String password) {
        // TODO: Implement password validation following TDD approach
        // Consider these criteria:
        // - Minimum 8 characters
        // - At least 1 uppercase letter
        // - At least 1 lowercase letter  
        // - At least 1 number
        // - At least 1 special character (!@#$%^&*()_+-=[]{}|;:,.<>?)
        public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String normalized = numbers.replace("\n", ",");
        String[] parts = normalized.split(",");

        int sum = 0;
        for (String part : parts) {
            int num = Integer.parseInt(part.trim());

            if (num < 0) {
                throw new IllegalArgumentException("Número negativo no permitido: " + num);
            }

            sum += num;
        }

        return sum;
    }
}
    }
}
