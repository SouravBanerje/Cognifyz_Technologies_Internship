package org.example;

public class TemperatureConverter {
    public static void celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }

    public static void fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in Celsius is: " + celsius);
    }
}
