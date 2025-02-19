package ss3.thuc_hanh;

import java.util.Scanner;

public class convertTemperature {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the temperature in Fahrenheit");
                    fahrenheit = celsiusToFahrenheit(sc.nextDouble());
                    System.out.println(fahrenheit);
                    break;
                case 2:
                    System.out.println("Enter the temperature in Celsius");
                    celsius = fahrenheitToCelsius(sc.nextDouble());
                    System.out.println(celsius);
                    break;
                case 3 :
                    System.exit(0);
            }
        }while (choice != 3);
    }
}
