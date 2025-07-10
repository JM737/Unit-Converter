/*TODO: 1. Create a class named UnitMain. // This class will contain the main method.
    2. Create a scanner to read user input. (Either it is a String or a int)
    3. Display a menu with a variety of unit conversion options. (String or a int)
    - Length (meters, kilometers, miles)
    - Weight (grams, kilograms, pounds)
       - Temperature (Celsius, Fahrenheit)
       4. Prompt the converted input */
import java.util.Scanner;
public class UnitMain {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number to convert: ");
        int number = sc.nextInt();
        System.out.println("Number that will be converted: " + number);
    }
}
