package com.Main;

import com.converters.CurrencyConverter;
import com.converters.DistanceConverter;
import com.converters.TimeConverter;
import java.util.Scanner;


public class MainApp {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\nMain Menu");
                System.out.println("1. Currency Converter");
                System.out.println("2. Distance Converter");
                System.out.println("3. Time Converter");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        currencyMenu(scanner);
                        break;
                    case 2:
                        distanceMenu(scanner);
                        break;
                    case 3:
                        timeMenu(scanner);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 4);

            scanner.close();
        }

        private static void currencyMenu(Scanner scanner) {
            System.out.println("\nCurrency Converter");
            System.out.println("1. Dollar to GHS");
            System.out.println("2. GHS to Dollar");
            System.out.println("3. Euro to GHS");
            System.out.println("4. GHS to Euro");
            System.out.println("5. Yen to GHS");
            System.out.println("6. GHS to Yen");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            switch (option) {
                case 1 -> System.out.println(amount + " USD = " + CurrencyConverter.dollarToGhs(amount) + " GHS");
                case 2 -> System.out.println(amount + " GHS = " + CurrencyConverter.ghsToDollar(amount) + " USD");
                case 3 -> System.out.println(amount + " EURO = " + CurrencyConverter.euroToGhs(amount) + " GHS");
                case 4 -> System.out.println(amount + " GHS = " + CurrencyConverter.ghsToEuro(amount) + " EURO");
                case 5 -> System.out.println(amount + " YEN = " + CurrencyConverter.yenToGhs(amount) + " GHS");
                case 6 -> System.out.println(amount + " GHS = " + CurrencyConverter.ghsToYen(amount) + " YEN");
                default -> System.out.println("Invalid option!");
            }
        }

        private static void distanceMenu(Scanner scanner) {
            System.out.println("\nDistance Converter");
            System.out.println("1. Meters to KM");
            System.out.println("2. KM to Meters");
            System.out.println("3. Miles to KM");
            System.out.println("4. KM to Miles");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();

            System.out.print("Enter value: ");
            double value = scanner.nextDouble();

            switch (option) {
                case 1 -> System.out.println(value + " meters = " + DistanceConverter.metersToKm(value) + " km");
                case 2 -> System.out.println(value + " km = " + DistanceConverter.kmToMeters(value) + " meters");
                case 3 -> System.out.println(value + " miles = " + DistanceConverter.milesToKm(value) + " km");
                case 4 -> System.out.println(value + " km = " + DistanceConverter.kmToMiles(value) + " miles");
                default -> System.out.println("Invalid option!");
            }
        }

        private static void timeMenu(Scanner scanner) {
            System.out.println("\nTime Converter");
            System.out.println("1. Hours to Minutes");
            System.out.println("2. Minutes to Hours");
            System.out.println("3. Hours to Seconds");
            System.out.println("4. Seconds to Hours");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();

            System.out.print("Enter time: ");
            double time = scanner.nextDouble();

            switch (option) {
                case 1 -> System.out.println(time + " hours = " + TimeConverter.hoursToMinutes(time) + " minutes");
                case 2 -> System.out.println(time + " minutes = " + TimeConverter.minutesToHours(time) + " hours");
                case 3 -> System.out.println(time + " hours = " + TimeConverter.hoursToSeconds(time) + " seconds");
                case 4 -> System.out.println(time + " seconds = " + TimeConverter.secondsToHours(time) + " hours");
                default -> System.out.println("Invalid option!");
            }
        }
}
