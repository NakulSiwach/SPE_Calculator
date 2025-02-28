package com.example.calculator;

import java.math.BigInteger;

public class Calculator {

    // Square root function: √x
    public static double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Negative input not allowed for square root.");
        }
        return Math.sqrt(x);
    }

    // Factorial function: x!
    // For larger numbers, BigInteger is used.
    public static BigInteger factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Negative input not allowed for factorial.");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Natural logarithm: ln(x)
    public static double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Non-positive input not allowed for natural log.");
        }
        return Math.log(x);
    }

    // Power function: x^b
    public static double power(double x, double b) {
        return Math.pow(x, b);
    }
}
