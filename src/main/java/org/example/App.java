/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Locale;
import java.util.Scanner;

/**
 * Temperature Converter
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        double temperature;
        String selection, output;

        System.out.println("Press C to convert from Fahrenheit to Celsius");
        System.out.println("Press F to convert from Celsius to Fahrenheit");
        System.out.printf("Your choice: ");
        selection = scanner.nextLine().toLowerCase(Locale.ROOT);

        switch (selection) {
            case "c":
                System.out.print("Please enter the temperature in Fahrenheit: ");
                temperature = (scanner.nextDouble() - 32.0) * (5.0 / 9.0);
                output = String.format("The temperature in Celsius is %.2f", temperature);
                break;
            case "f":
                System.out.print("Please enter the temperature in Celsius: ");
                temperature = (scanner.nextDouble() * (9.0 / 5.0)) + 32.0;
                output = String.format("The temperature in Fahrenheit is %.2f", temperature);
                break;
            default:
                System.out.println("Your choice was not valid");
                return;
        }

        System.out.println(output);

    }
}
