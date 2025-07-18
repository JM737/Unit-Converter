package ConverterPackage;

class LengthConvert {
    public void secondNumCon(double numConversion1) {}
    public void thirdNumCon(double numConversion2) {}
}

class Meter extends LengthConvert {
    public void secondNumCon(double meterNum2) {
        double meter_kilo = meterNum2 * 0.001;
        System.out.println("Meter to Kilometer: " + meter_kilo);
    }
    public void thirdNumCon(double meterNum3) {
        double meter_miles = meterNum3  * 0.000621371192;
        System.out.println("Meter to Miles: " + meter_miles);
    }
}

class Kilometer extends Meter {
    public void secondNumCon(double kilometerNum2) {
        double kilo_meter = kilometerNum2 * 1000;
        System.out.println("Kilometer to Meter: " + kilo_meter);
    }
    public void thirdNumCon(double kilometerNum3) {
        double kilometer_miles = kilometerNum3 * 0.62137119;
        System.out.println("Kilometer to Miles: " + kilometer_miles);
    }
}

class Miles extends LengthConvert {
    public void secondNumCon(double milesNum2) {
        double miles_meter = milesNum2 * 1609.34;
        System.out.println("Miles to Meter: " + miles_meter);
    }
    public void thirdNumCon(double milesNum3) {
        double miles_kilo = milesNum3 * 1.60934;
        System.out.println("Miles to Kilometer: " + miles_kilo);
    }
}