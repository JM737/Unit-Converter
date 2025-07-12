/*TODO: 1. Create a class named UnitMain. // This class will contain the main method.
    2. Create a scanner to read user input. (Either it is a String or a int)
    3. Display a menu with a variety of unit conversion options. (String or a int)
    - Polymorphism in one class or separate class (seperate class is better)
    - Length (meters, kilometers, miles) = (done)
    - Weight (grams, kilograms, pounds)
    - Temperature (Celsius, Fahrenheit)
    - Volume (liters, gallons)
       4. Prompt the converted input */
import java.util.Scanner;
public class UnitMain{
    static Meter meter = new Meter();
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        double input = sc.nextDouble();
        meter.firstNumCon(input);
        System.out.println();
    }
}
