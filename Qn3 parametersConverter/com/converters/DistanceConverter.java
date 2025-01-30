package com.converters;

public class DistanceConverter {
    public static double metersToKm(double meters) {
        return meters / 1000;
    }

    public static double kmToMeters(double km) {
        return km * 1000;
    }

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double kmToMiles(double km) {
        return km / 1.60934;
    }
}
