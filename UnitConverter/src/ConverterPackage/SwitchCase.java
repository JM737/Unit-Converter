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
    Scanner switchChoice = new Scanner(System.in);
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
    public void convertChoices(int choice) {
        switch(choice) {
            case 1:
                System.out.println("You chose Length conversion.");
                System.out.println("1. Meters to Kilometers");
                System.out.println("2. Meters to Miles");
                System.out.println("3. Kilometers to Meters");
                System.out.println("4. Kilometers to Miles");
                System.out.println("5. Miles to Meters");
                System.out.println("6. Miles to Kilometers");
                int lengthChoice = switchChoice.nextInt();

                /*switch(lengthChoice) {
                    case 1:
                        meter.firstNumCon(1000); // Example input
                        break;
                    case 2:
                        meter.secondNumCon(1609.34); // Example input
                        break;
                    case 3:
                        kilometer.firstNumCon(1); // Example input
                        break;
                    case 4:
                        kilometer.secondNumCon(1); // Example input
                        break;
                    case 5:
                        miles.firstNumCon(1); // Example input
                        break;
                    case 6:
                        miles.secondNumCon(1); // Example input
                        break;
                    default:
                        System.out.println("Invalid choice for Length conversion.");
                }
                break;*/

            case 2:
                System.out.println("You chose Weight conversion.");
                System.out.println("1. Grams to Kilograms");
                System.out.println("2. Grams to Pounds");
                System.out.println("3. Kilograms to Grams");
                System.out.println("4. Kilograms to Pounds");
                System.out.println("5. Pounds to Grams");
                System.out.println("6. Pounds to Kilograms");
                int weightChoice = switchChoice.nextInt();

                /*switch(weightChoice) {
                    case 1:
                        grams.firstWeightCon(1000); // Example input
                        break;
                    case 2:
                        grams.secondWeightCon(2.20462); // Example input
                        break;
                    case 3:
                        kilograms.firstWeightCon(1); // Example input
                        break;
                    case 4:
                        kilograms.secondWeightCon(2.20462); // Example input
                        break;
                    case 5:
                        pounds.firstWeightCon(1); // Example input
                        break;
                    case 6:
                        pounds.secondWeightCon(1); // Example input
                        break;
                    default:
                        System.out.println("Invalid choice for Weight conversion.");
                }
                break;*/
            case 3:
                System.out.println("You chose Temperature conversion.");
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Fahrenheit to Celsius");
                int tempChoice = switchChoice.nextInt();

                /*switch(tempChoice) {
                    case 1:
                        celsius.firstTempCon(25); // Example input
                        celsius.secondTempCon(25); // Example input
                        break;
                    case 2:
                        fahrenheit.firstTempCon(77); // Example input
                        fahrenheit.secondTempCon(77); // Example input
                        break;
                    default:
                        System.out.println("Invalid choice for Temperature conversion.");
                }
                break;*/

            case 4:
                System.out.println("You chose Volume conversion.");
                System.out.println("1. Liters to Gallons");
                System.out.println("2. Gallons to Liters");
                int volumeChoice = switchChoice.nextInt();

                /*switch(volumeChoice) {
                    case 1:
                        liters.firstVolumeCon(3.78541); // Example input
                        break;
                    case 2:
                        gallons.firstVolumeCon(1); // Example input
                        break;
                    default:
                        System.out.println("Invalid choice for Volume conversion.");
                }
                break;*/
            case 5:
                System.out.println("Exiting the program.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

