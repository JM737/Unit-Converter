package ConverterPackage;
/*TODO: 1. Create a class named UnitMain. // This class will contain the main method.
    2. Create a scanner to read user input. (Either it is a String or a int)
    3. Display a menu with a variety of unit conversion options. (String or a int)
        -switch case for each conversion type
            - using a default if the user enters an invalid option.
                - it should prompt the user to enter a valid option. (infinitely until valid)
        - and the user should put a number to each type of conversion.
            - if the user enters a string, it should prompt the user to "enter a valid number". (infinitely until valid)
    */

import java.util.Scanner;
public class UnitMain{
    public static boolean isValid = true;
    static SwitchCase switchChoice = new SwitchCase();
    static Scanner sc = new Scanner (System.in);
    static void displayMenu() {
        System.out.print(""" 
                    [   UNIT CONVERTER  ]
                Please choose a conversion type:
                1. Length (meters, kilometers, miles)
                2. Weight (grams, kilograms, pounds)
                3. Temperature (Celsius, Fahrenheit)
                4. Volume (liters, gallons)
                5. Exit
                Enter your choice (1-5):\s""");
    }
    public static void main(String[] args) {
        do {
            displayMenu();
            int choice = sc.nextInt();
            switchChoice.convertChoices(choice);
        } while (isValid);
    }
}
