package com.tp2.stringcalculator;

public class StringCalculator {
    
    public int add(String numbers) {
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
