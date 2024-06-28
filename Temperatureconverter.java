import java.util.Scanner;

public class Temperatureconverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);
        
        double celsius, fahrenheit, kelvin;
        
        switch (unit) {
            case 'C':
                celsius = temperature;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                System.out.printf("Temperature in Celsius: %.2fC\n", celsius);
                System.out.printf("Temperature in Fahrenheit: %.2fF\n", fahrenheit);
                System.out.printf("Temperature in Kelvin: %.2fK\n", kelvin);
                break;
            case 'F':
                fahrenheit = temperature;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = celsiusToKelvin(celsius);
                System.out.printf("Temperature in Fahrenheit: %.2fF\n", fahrenheit);
                System.out.printf("Temperature in Celsius: %.2fC\n", celsius);
                System.out.printf("Temperature in Kelvin: %.2fK\n", kelvin);
                break;
            case 'K':
                kelvin = temperature;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf("Temperature in Kelvin: %.2fK\n", kelvin);
                System.out.printf("Temperature in Celsius: %.2fC\n", celsius);
                System.out.printf("Temperature in Fahrenheit: %.2fF\n", fahrenheit);
                break;
            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
        }
        
        scanner.close();
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}