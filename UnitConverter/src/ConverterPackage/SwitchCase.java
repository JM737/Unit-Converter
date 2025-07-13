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
    Scanner scanner = new Scanner(System.in);
    LengthConvert miles = new Miles();
    LengthConvert kilometer = new Kilometer();
    LengthConvert meter = new Meter();
    WeightConvert pounds = new Pounds();
    WeightConvert kilograms = new Kilograms();
    WeightConvert grams = new Grams();
    TemperatureConvert fahrenheit = new Fahrenheit();
    TemperatureConvert celsius = new Celsius();
    VolumeConvert gallons = new Gallons();
    VolumeConvert liters = new Liters();
    public void askNumber(){
        System.out.println("Please enter a number to convert:");
    }
    public void convertChoices(int choice) {
        switch(choice) {
            case 1:
                System.out.println("""
                        ===========================
                            LENGTH CONVERSION.
                        ===========================  \s
                        1. Meters to Kilometers
                        2. Meters to Miles
                        3. Kilometers to Meters
                        4. Kilometers to Miles
                        5. Miles to Meters
                        6. Miles to Kilometers
                       \s""");
                int lengthChoice = scanner.nextInt();

                switch(lengthChoice) {
                    case 1:
                        askNumber();
                        double meters = scanner.nextDouble();
                        meter.firstNumCon(meters); // Example input
                        break;
                    case 2:
                        askNumber();
                        double metersToMiles = scanner.nextDouble();
                        meter.secondNumCon(metersToMiles); // Example input
                        break;
                    case 3:
                        askNumber();
                        double kilometers = scanner.nextDouble();
                        kilometer.firstNumCon(kilometers); // Example input
                        break;
                    case 4:
                        askNumber();
                        double metersToKilometers = scanner.nextDouble();
                        kilometer.secondNumCon(metersToKilometers); // Example input
                        break;
                    case 5:
                        askNumber();
                        double milesInput = scanner.nextDouble();
                        miles.firstNumCon(milesInput); // Example input
                        break;
                    case 6:
                        askNumber();
                        double milesToMeters = scanner.nextDouble();
                        miles.secondNumCon(milesToMeters); // Example input
                        break;
                    default:
                        System.out.println("Invalid choice for Length conversion.");
                }
                break;

            case 2:
                System.out.println("You chose Weight conversion.");
                System.out.println("1. Grams to Kilograms");
                System.out.println("2. Grams to Pounds");
                System.out.println("3. Kilograms to Grams");
                System.out.println("4. Kilograms to Pounds");
                System.out.println("5. Pounds to Grams");
                System.out.println("6. Pounds to Kilograms");
                int weightChoice = scanner.nextInt();

                switch(weightChoice) {
                    case 1:
                        grams.firstWeightCon(); // Example input
                        break;
                    case 2:
                        grams.secondWeightCon(); // Example input
                        break;
                    case 3:
                        kilograms.firstWeightCon(); // Example input
                        break;
                    case 4:
                        kilograms.secondWeightCon(); // Example input
                        break;
                    case 5:
                        pounds.firstWeightCon(); // Example input
                        break;
                    case 6:
                        pounds.secondWeightCon(); // Example input
                        break;
                    default:
                        System.out.println("Invalid choice for Weight conversion.");
                }
                break;
            case 3:
                System.out.println("You chose Temperature conversion.");
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Fahrenheit to Celsius");
                int tempChoice = scanner.nextInt();

                switch(tempChoice) {
                    case 1:
                        celsius.firstTempCon(); // Example input
                        celsius.secondTempCon(); // Example input
                        break;
                    case 2:
                        fahrenheit.firstTempCon(); // Example input
                        fahrenheit.secondTempCon(); // Example input
                        break;
                    default:
                        System.out.println("Invalid choice for Temperature conversion.");
                }
                break;

            case 4:
                System.out.println("You chose Volume conversion.");
                System.out.println("1. Liters to Gallons");
                System.out.println("2. Gallons to Liters");
                int volumeChoice = scanner.nextInt();

                switch(volumeChoice) {
                    case 1:
                        liters.firstVolumeCon(); // Example input
                        break;
                    case 2:
                        gallons.firstVolumeCon(); // Example input
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
        }
    }
}

