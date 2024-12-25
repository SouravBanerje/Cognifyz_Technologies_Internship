package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTemperature Converter");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double celsius = scanner.nextDouble();
                    TemperatureConverter.celsiusToFahrenheit(celsius);
                    break;
                case 2:
                    double fahrenheit = scanner.nextDouble();
                    TemperatureConverter.fahrenheitToCelsius(fahrenheit);
                    break;
                case 3:
                    System.out.println("Exiting Temperature Converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}