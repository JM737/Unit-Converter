package ConverterPackage;

public class TemperatureConvert {
    public void firstTempCon() {};
    public void secondTempCon() {};
}
    class Celsius extends TemperatureConvert {
        public void firstTempCon(double celsiusNum1) {
            System.out.println(celsiusNum1);
        }

        public void secondTempCon(double celsiusNum2) {
            double celsius_fahrenheit = (celsiusNum2 * 9/5) + 32;
            System.out.println(celsius_fahrenheit);
        }
    }

    class Fahrenheit extends Celsius {
        public void firstTempCon(double fahrenheitNum1) {
            super.firstTempCon(fahrenheitNum1);
        }

        public void secondTempCon(double fahrenheitNum2) {
            double fahrenheit_celsius = (fahrenheitNum2 - 32) * 5/9;
            System.out.println(fahrenheit_celsius);
        }
    }
