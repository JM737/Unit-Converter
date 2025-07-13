package ConverterPackage;
/*TODO:
1. Create a method named switchCase in the SwitchCase class.
2. The method should take an integer parameter named choice.
3. Use switch for different types of conversions.
    - Inner switch for another type of conversion
4. Default for handling invalid input.
 */
public class SwitchCase {
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
    public void switchCase(int choice) {
        switch(choice) {

        }
    }
}

