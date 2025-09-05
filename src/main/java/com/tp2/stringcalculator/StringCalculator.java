package com.tp2.stringcalculator;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        String[] tokens = numbers.split("[,\n]");
        int sum = 0;
        for (String token : tokens) {
            int num = Integer.parseInt(token);
            if (num < 0) throw new IllegalArgumentException("Negative numbers not allowed: " + num);
            sum += num;
        }
        return sum;
    }
}