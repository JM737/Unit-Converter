/*TODO: 1. Create a class named UnitMain. // This class will contain the main method.
    2. Create a scanner to read user input. (Either it is a String or a int)
    3. Display a menu with a variety of unit conversion options. (String or a int)
    - Polymorphism in one class or separate class (separate class is better)
    - Length (meters, kilometers, miles) /done
    - Weight (grams, kilograms, pounds) /done
    - Temperature (Celsius, Fahrenheit) /ongoing
    - Volume (liters, gallons)
       4. Prompt the converted input */
import java.util.Scanner;
public class UnitMain{
    //NEED TO LEARN ON HOW TO ACCESS THE WHOLE CLASSES WITH A SINGLE OBJECT//
    static LengthConvert miles = new Miles();
    static LengthConvert kilometer = new Kilometer();
    static LengthConvert meter = new Meter();

    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {

    }
}
