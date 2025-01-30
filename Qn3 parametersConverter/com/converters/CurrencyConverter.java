package com.converters;

public class CurrencyConverter {
    // Exchange rates
    private static final double DOLLAR_TO_GHS = 15.31;
    private static final double EURO_TO_GHS = 15.90;
    private static final double YEN_TO_GHS = 0.099;

    public static double dollarToGhs(double amount) {
        return amount * DOLLAR_TO_GHS;
    }

    public static double ghsToDollar(double amount) {
        return amount / DOLLAR_TO_GHS;
    }

    public static double euroToGhs(double amount) {
        return amount * EURO_TO_GHS;
    }

    public static double ghsToEuro(double amount) {
        return amount / EURO_TO_GHS;
    }

    public static double yenToGhs(double amount) {
        return amount * YEN_TO_GHS;
    }

    public static double ghsToYen(double amount) {
        return amount / YEN_TO_GHS;
    }
}
