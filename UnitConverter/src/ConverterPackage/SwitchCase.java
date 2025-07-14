package ConverterPackage;
/*TODO:
1. Create a method named switchCase in the SwitchCase class.
2. The method should take an integer parameter named choice.
3. Use switch for different types of conversions.
    - Inner switch for another type of conversion
4. Default for handling invalid input.
 */
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
    public void askNumber(){
        System.out.print("Please enter a number to convert: ");
    }

    public void convertChoices(int choice) {
        switch(choice) {
            case 1:
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

                        int lengthChoice = scanner.nextInt();

                switch(lengthChoice) {
                    case 1:
                        System.out.println("METERS TO KILOMETERS");
                        askNumber();
                        double metersToKilometers = scanner.nextDouble();
                        meter.secondNumCon(metersToKilometers);
                        break;
                    case 2:
                        System.out.println("METERS TO MILES");
                        askNumber();
                        double metersToMiles = scanner.nextDouble();
                        meter.thirdNumCon(metersToMiles); // Example input
                        break;
                    case 3:
                        System.out.println("KILOMETERS TO METERS");
                        askNumber();
                        double kilometerToMeters = scanner.nextDouble();
                        kilometer.secondNumCon(kilometerToMeters); // Example input
                        break;
                    case 4:
                        System.out.println("KILOMETERS TO MILES");
                        askNumber();
                        double kilometersToMiles = scanner.nextDouble();
                        kilometer.thirdNumCon(kilometersToMiles);
                        break;
                    case 5:
                        System.out.println("MILES TO METERS");
                        askNumber();
                        double milesToMeters = scanner.nextDouble();
                        miles.secondNumCon(milesToMeters);
                        break;
                    case 6:
                        System.out.println("MILES TO KILOMETERS");
                        askNumber();
                        double milesToKilometers = scanner.nextDouble();
                        miles.thirdNumCon(milesToKilometers);
                        break;
                    case 7:
                        System.out.println("Exiting Length conversion.");
                        break;
                    default:
                        System.out.println("Invalid choice for Length conversion.");
                }
                break;

            case 2:
                System.out.print("""
                    =============================
                        WEIGHT CONVERSION.
                    =============================    
                    1. Grams to Kilograms
                    2. Grams to Pounds
                    3. Kilograms to Grams
                    4. Kilograms to Pounds
                    5. Pounds to Grams
                    6. Pounds to Kilograms
                    7. Exit
                    ===========================
                    Please select a conversion type:\s""");
                int weightChoice = scanner.nextInt();

                switch(weightChoice) {
                    case 1:
                        System.out.println("GRAMS TO KILOGRAMS");
                        askNumber();
                        double gramsNum1 = scanner.nextDouble();
                        grams.secondWeightCon(gramsNum1);
                        break;
                    case 2:
                        System.out.println("GRAMS TO POUNDS");
                        askNumber();
                        double gramsNum2 = scanner.nextDouble();
                        grams.thirdWeightCon(gramsNum2); // Example input
                        break;
                    case 3:
                        System.out.println("KILOGRAMS TO GRAMS");
                        askNumber();
                        double kilogramsNum1 = scanner.nextDouble();
                        kilograms.secondWeightCon(kilogramsNum1); // Example input
                        break;
                    case 4:
                        System.out.println("KILOGRAMS TO POUNDS");
                        askNumber();
                        double kilogramsNum2 = scanner.nextDouble();
                        kilograms.thirdWeightCon(kilogramsNum2);
                        break;
                    case 5:
                        System.out.println("POUNDS TO GRAMS");
                        askNumber();
                        double poundsNum1 = scanner.nextDouble();
                        pounds.secondWeightCon(poundsNum1); // Example input
                        break;
                    case 6:
                        System.out.println("POUNDS TO KILOGRAMS");
                        askNumber();
                        double poundsNum2 = scanner.nextDouble();
                        pounds.thirdWeightCon(poundsNum2);
                        break;
                    case 7:
                        System.out.println("Exiting Weight conversion.");
                        break;
                    default:
                        System.out.println("Invalid choice for Weight conversion.");
                }
                break;
            case 3:
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
                int tempChoice = scanner.nextInt();

                switch(tempChoice) {
                    case 1:
                        System.out.println("CELSIUS TO FAHRENHEIT");
                        askNumber();
                        double celsiusNum1 = scanner.nextDouble();// Example input
                        celsius.secondTempCon(celsiusNum1); // Example input
                        break;
                    case 2:
                        System.out.println("FAHRENHEIT TO CELSIUS");
                        askNumber();
                        double celsiusNum2 = scanner.nextDouble();// Example input
                        fahrenheit.secondTempCon(celsiusNum2); // Example input
                        break;
                    case 3:
                        System.out.println("Exiting Temperature conversion.");
                        break;
                    default:
                        System.out.println("Invalid choice for Temperature conversion.");
                }
                break;

            case 4:
                System.out.println("""
                        =============================
                              VOLUME CONVERSION.
                        =============================    
                        1. Liters to Gallons
                        2. Gallons to Liters
                        3. Exit
                        ===========================
                        Please select a conversion type:\s
                        """);
                int volumeChoice = scanner.nextInt();

                switch(volumeChoice) {
                    case 1:
                        System.out.println("LITERS TO GALLONS");
                        askNumber();
                        double litersNum1 = scanner.nextDouble(); // Example input
                        liters.secondVolumeCon(litersNum1); // Example input
                        break;
                    case 2:
                        System.out.println("GALLONS TO LITERS");
                        askNumber();
                        double gallonsNum1 = scanner.nextDouble(); // Example input
                        gallons.secondVolumeCon(gallonsNum1); // Example input
                        break;
                    case 3:
                        System.out.println("Exiting Volume conversion.");
                        break;
                    default:
                        System.out.println("Invalid choice for Volume conversion.");
                }
                break;
            case 5:
                System.out.println("Exiting the program.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

