package ConverterPackage;

import java.util.Scanner;
public class UnitMain{
    public static boolean outterLoop = true;
    public static boolean innerLoop = true;
    static SwitchCase switchCase1 = new SwitchCase();
    static SwitchCase2 switchCase2 = new SwitchCase2();
    static Scanner sc = new Scanner (System.in);
    public static void displayChoices() {
        System.out.println("""
                [  CONVERTER  ]
                Please choose a conversion type:
                1. Unit Converter
                2. Currency Converter
                3. Exit
                Enter your choice (1-3):\s);
                """);
    }
    public static void main(String[] args) {
        do {
            displayChoices();
            if (sc.hasNextInt()) {
                int converterChoice = sc.nextInt();
                switch (converterChoice) {
                    case 1:
                        do {
                            int choice;
                            SwitchCase.displayUnitCon();
                            if (sc.hasNextInt()) {
                                choice = sc.nextInt();
                                if (choice < 1 || choice > 5) {
                                    System.out.println("Please enter a valid number.");
                                    System.out.println();
                                }
                            } else {
                                System.out.println("Please enter a valid number.");
                                sc.next(); // Clear the invalid input
                                System.out.println();
                                continue; // Restart the loop
                            }
                            switchCase1.unitConversion(choice);
                        } while (innerLoop);
                        break;
                    case 2:
                        switchCase2.currencyConversion();
                        break;
                    case 3:
                        System.out.println("Exiting the program. Goodbye!");
                        outterLoop = false;
                        break;
                    default:
                        System.out.println("Please enter a valid number.");
                        System.out.println();
                }
            } else {
                System.out.println("Please enter a valid number.");
                sc.next(); // Clear the invalid input
                System.out.println();
            }
        } while (outterLoop);
    }
}
