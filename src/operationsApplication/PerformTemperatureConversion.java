package operationsApplication;

import operationsLibrary.TemperatureConverter;
import java.util.Scanner;

public class PerformTemperatureConversion {

    public void runConversion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Enter temperature in Celsius:");
            double celsius = scanner.nextDouble();
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        } else if (choice == 2) {
            System.out.println("Enter temperature in Fahrenheit:");
            double fahrenheit = scanner.nextDouble();
            double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "°F = " + celsius + "°C");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
