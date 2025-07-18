package ConverterPackage;
import java.util.Scanner;
public class SwitchCase {
    private final Scanner scanner;

    // Length converters
    private final LengthConvert miles;
    private final LengthConvert kilometer;
    private final LengthConvert meter;

    // Weight converters
    private final WeightConvert pounds;
    private final WeightConvert kilograms;
    private final WeightConvert grams;

    // Temperature converters
    private final TemperatureConvert fahrenheit;
    private final TemperatureConvert celsius;

    // Volume converters
    private final VolumeConvert gallons;
    private final VolumeConvert liters;

    public SwitchCase() {
        scanner = new Scanner(System.in);

        miles = new Miles();
        kilometer = new Kilometer();
        meter = new Meter();

        pounds = new Pounds();
        kilograms = new Kilograms();
        grams = new Grams();

        fahrenheit = new Fahrenheit();
        celsius = new Celsius();

        gallons = new Gallons();
        liters = new Liters();

    }
    public static void displayUnitCon() {
        System.out.print(""" 
                    [   UNIT CONVERTER  ]
                Please choose a conversion type:
                1. Length (meters <-> kilometers <-> miles)
                2. Weight (grams <-> kilograms <-> pounds)
                3. Temperature (Celsius <-> Fahrenheit)
                4. Volume (liters <-> gallons)
                5. Exit
                Enter your choice (1-5):\s""");
    }
    public int getValidInteger(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
                System.out.println();
            }
        }

    }
            // Control loops
            boolean outerLoop = true;
            boolean innerLoop = true;

    public void unitConversion(int choice) {
        switch(choice) {

                                                        // LENGTH CONVERSION
            case 1:
                int lengthChoice;
                do {
                    System.out.print("""
                            
                            ===========================
                                LENGTH CONVERSION.
                            ===========================  \s
                            1. Meters to Kilometers
                            2. Meters to Miles
                            3. Kilometers to Meters
                            4. Kilometers to Miles
                            5. Miles to Meters
                            6. Miles to Kilometers
                            7. Exit
                            ===========================
                            Please select a conversion type:\s""");
                    if (scanner.hasNextInt()) {
                        lengthChoice = scanner.nextInt();
                    }else{
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next();
                        System.out.println();
                        continue;
                    }


                    do {
                        switch (lengthChoice) {
                            case 1:
                                System.out.println("    METERS TO KILOMETERS");
                                double metersToKilometers = getValidInteger("Enter a number to convert: ");
                                meter.secondNumCon(metersToKilometers);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice = scanner.next();
                                if (!continueChoice.equals("yes")) {
                                    System.out.println("Exiting Length conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Length conversion.");
                                }
                                break;
                            case 2:
                                System.out.println("    METERS TO MILES");
                                double metersToMiles = getValidInteger("Enter a number to convert: ");
                                meter.thirdNumCon(metersToMiles);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice2 = scanner.next();
                                if (!continueChoice2.equals("yes")) {
                                    System.out.println("Exiting Length conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Length conversion.");
                                }
                                break;
                            case 3:
                                System.out.println("    KILOMETERS TO METERS");
                                double kilometerToMeters = getValidInteger("Enter a number to convert: ");
                                kilometer.secondNumCon(kilometerToMeters);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice3 = scanner.next();
                                if (!continueChoice3.equals("yes")) {
                                    System.out.println("Exiting Length conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Length conversion.");
                                }
                                break;
                            case 4:
                                System.out.println("    KILOMETERS TO MILES");
                                double kilometersToMiles = getValidInteger("Enter a number to convert: ");
                                kilometer.thirdNumCon(kilometersToMiles);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice4 = scanner.next();
                                if (!continueChoice4.equals("yes")) {
                                    System.out.println("Exiting Length conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Length conversion.");
                                }
                                break;
                            case 5:
                                System.out.println("    MILES TO METERS");
                                double milesToMeters = getValidInteger("Enter a number to convert: ");
                                miles.secondNumCon(milesToMeters);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice5 = scanner.next();
                                if (!continueChoice5.equals("yes")) {
                                    System.out.println("Exiting Length conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Length conversion.");
                                }
                                break;
                            case 6:
                                System.out.println("    MILES TO KILOMETERS");
                                double milesToKilometers = getValidInteger("Enter a number to convert: ");
                                miles.thirdNumCon(milesToKilometers);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice6 = scanner.next();
                                if (!continueChoice6.equals("yes")) {
                                    System.out.println("Exiting Length conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Length conversion.");
                                }
                                break;
                            case 7:
                                System.out.println("Exiting Length conversion.");
                                System.out.println();
                                innerLoop = false;
                                outerLoop = false;
                                break;
                            default:
                                System.out.println("Invalid choice for Length conversion.");
                                innerLoop = false; // Exit the inner loop for invalid choice
                                break;
                        }
                    } /*INNER LOOP*/ while (innerLoop);
                } while (outerLoop);
                break;

                                                // WEIGHT CONVERSION
            case 2:
                int weightChoice;
                do {
                    System.out.print("""
                            =============================
                                WEIGHT CONVERSION.
                            =============================   \s
                            1. Grams to Kilograms
                            2. Grams to Pounds
                            3. Kilograms to Grams
                            4. Kilograms to Pounds
                            5. Pounds to Grams
                            6. Pounds to Kilograms
                            7. Exit
                            ===========================
                            Please select a conversion type:\s""");
                    if (scanner.hasNextInt()) {
                        weightChoice = scanner.nextInt();
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Clear the invalid input
                        System.out.println();
                        continue; // Restart the outer loop
                    }

                    do {
                        switch (weightChoice) {
                            case 1:
                                System.out.println("    GRAMS TO KILOGRAMS");
                                double gramsNum1 = getValidInteger("Enter a number to convert: ");
                                grams.secondWeightCon(gramsNum1);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice = scanner.next();
                                if (!continueChoice.equals("yes")) {
                                    System.out.println("Exiting Weight conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Weight conversion.");
                                }
                                break;
                            case 2:
                                System.out.println("    GRAMS TO POUNDS");
                                double gramsNum2 = getValidInteger("Enter a number to convert: ");
                                grams.thirdWeightCon(gramsNum2);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice2 = scanner.next();
                                if (!continueChoice2.equals("yes")) {
                                    System.out.println("Exiting Weight conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Weight conversion.");
                                }
                                break;
                            case 3:
                                System.out.println("    KILOGRAMS TO GRAMS");
                                double kilogramsNum1 = getValidInteger("Enter a number to convert: ");
                                kilograms.secondWeightCon(kilogramsNum1);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice3 = scanner.next();
                                if (!continueChoice3.equals("yes")) {
                                    System.out.println("Exiting Weight conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Weight conversion.");
                                }
                                break;
                            case 4:
                                System.out.println("    KILOGRAMS TO POUNDS");
                                double kilogramsNum2 = getValidInteger("Enter a number to convert: ");
                                kilograms.thirdWeightCon(kilogramsNum2);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice4 = scanner.next();
                                if (!continueChoice4.equals("yes")) {
                                    System.out.println("Exiting Weight conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Weight conversion.");
                                }
                                break;
                            case 5:
                                System.out.println("    POUNDS TO GRAMS");
                                double poundsNum1 = getValidInteger("Enter a number to convert: ");
                                pounds.secondWeightCon(poundsNum1);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice5 = scanner.next();
                                if (!continueChoice5.equals("yes")) {
                                    System.out.println("Exiting Weight conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Weight conversion.");
                                }
                                break;
                            case 6:
                                System.out.println("    POUNDS TO KILOGRAMS");
                                double poundsNum2 = getValidInteger("Enter a number to convert: ");
                                pounds.thirdWeightCon(poundsNum2);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice6 = scanner.next();
                                if (!continueChoice6.equals("yes")) {
                                    System.out.println("Exiting Weight conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Weight conversion.");
                                }
                                break;
                            case 7:
                                System.out.println("Exiting Weight conversion.");
                                System.out.println();
                                innerLoop = false;
                                outerLoop = false;
                                break;
                            default:
                                System.out.println("Invalid choice for Weight conversion.");
                                innerLoop = false;
                                break;
                        }
                    }while (innerLoop);
                } while (outerLoop);
                break;

                                                    // TEMPERATURE CONVERSION
            case 3:
                do {
                    int tempChoice;
                    System.out.println("""
                             ===========================
                               TEMPERATURE CONVERSION.
                             ===========================
                             1. Celsius to Fahrenheit
                             2. Fahrenheit to Celsius
                             3. Exit
                             ===========================
                             Please select a conversion type:\s
                            \s""");
                    if (scanner.hasNextInt()) {
                        tempChoice = scanner.nextInt();
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Clear the invalid input
                        System.out.println();
                        continue; // Restart the outer loop
                    }
                    do {
                        switch (tempChoice) {
                            case 1:
                                System.out.println("    CELSIUS TO FAHRENHEIT");
                                double celsiusNum1 = getValidInteger("Enter a number to convert: ");
                                celsius.secondTempCon(celsiusNum1);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice = scanner.next();
                                if (!continueChoice.equals("yes")) {
                                    System.out.println("Exiting Temperature conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Temperature conversion.");
                                }
                                break;
                            case 2:
                                System.out.println("    FAHRENHEIT TO CELSIUS");
                                double celsiusNum2 = getValidInteger("Enter a number to convert: ");
                                fahrenheit.secondTempCon(celsiusNum2);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice2 = scanner.next();
                                if (!continueChoice2.equals("yes")) {
                                    System.out.println("Exiting Temperature conversion.");
                                    System.out.println();
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Temperature conversion.");
                                }
                                break;
                            case 3:
                                System.out.println("Exiting Temperature conversion.");
                                System.out.println();
                                innerLoop = false;
                                outerLoop = false;
                                break;
                            default:
                                System.out.println("Invalid choice for Temperature conversion.");
                                innerLoop = false; // Exit the inner loop for invalid choice
                                break;
                        }
                    } while (innerLoop);
                } while (outerLoop);
                break;

                                                        // VOLUME CONVERSION
            case 4:
                int volumeChoice;
                do {
                    System.out.println("""
                             =============================
                                   VOLUME CONVERSION.
                             =============================   \s
                             1. Liters to Gallons
                             2. Gallons to Liters
                             3. Exit
                             ===========================
                             Please select a conversion type:\s
                            \s""");
                    if (scanner.hasNextInt()) {
                        volumeChoice = scanner.nextInt();
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Clear the invalid input
                        System.out.println();
                        continue; // Restart the outer loop
                    }

                    do {
                        switch (volumeChoice) {
                            case 1:
                                System.out.println("    LITERS TO GALLONS");
                                double litersNum1 = getValidInteger("Enter a number to convert: ");
                                liters.secondVolumeCon(litersNum1);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice = scanner.next();
                                if (!continueChoice.equals("yes")) {
                                    System.out.println("Exiting Volume conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Volume conversion.");
                                }
                                break;

                            case 2:
                                System.out.println("    GALLONS TO LITERS");
                                double gallonsNum1 = getValidInteger("Enter a number to convert: ");
                                gallons.secondVolumeCon(gallonsNum1);
                                System.out.println();
                                System.out.println("Do you want to continue? (yes/no)");
                                String continueChoice2 = scanner.next();
                                if (!continueChoice2.equals("yes")) {
                                    System.out.println("Exiting Volume conversion.");
                                    innerLoop = false;
                                    break;
                                } else {
                                    System.out.println("Continuing Volume conversion.");
                                }
                                break;
                            case 3:
                                System.out.println("Exiting Volume conversion.");
                                System.out.println();
                                innerLoop = false;
                                outerLoop = false;
                                break;
                            default:
                                System.out.println("Invalid choice for Volume conversion.");
                                innerLoop = false; // Exit the inner loop for invalid choice
                                break;
                        }
                    } while (innerLoop);
                } while (outerLoop);
                break;
                                                                //EXIT
            case 5:
                System.out.println("Exiting the program.");
                System.out.println();
                System.exit(0);
                break;
        }
    }
}

