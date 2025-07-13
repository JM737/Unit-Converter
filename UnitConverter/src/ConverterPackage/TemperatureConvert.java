package ConverterPackage;

public class TemperatureConvert {
    public void secondTempCon(double temperatureNumConversion) {};
}
    class Celsius extends TemperatureConvert {
        public void secondTempCon(double celsiusNum2) {
            double celsius_fahrenheit = (celsiusNum2 * 9d/5d) + 32d;
            System.out.println(celsius_fahrenheit);
        }
    }
    class Fahrenheit extends Celsius {
        public void secondTempCon(double fahrenheitNum2) {
            double fahrenheit_celsius = (fahrenheitNum2 - 32) * 5/9;
            System.out.println(fahrenheit_celsius);
        }
    }
