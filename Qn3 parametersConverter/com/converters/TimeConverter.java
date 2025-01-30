package com.converters;

public class TimeConverter {
    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    public static double hoursToSeconds(double hours) {
        return hours * 3600;
    }

    public static double secondsToHours(double seconds) {
        return seconds / 3600;
    }
}
