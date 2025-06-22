package com.example.financial;

public class Main {

    public static double futureValue(double currentValue, double rate, int years) {

        if (years == 0) {
            return currentValue;
        }
        return futureValue(currentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0;
        double rate = 0.05;
        int years = 10;

        double result = futureValue(currentValue, rate, years);

        System.out.println("Future Value after " + years + " years: " + result);

        System.out.println("\nTime Complexity: O(n) where n = number of years.");
        System.out.println("Optimization: You can use memoization or an iterative approach if years is very large.");
    }
}
