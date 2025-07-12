abstract class LengthConvert {
    public void firstNumCon() {};
    public void secondNumCon() {};
    public void thirdNumCon() {};
}

class Meter extends LengthConvert {
    public void firstNumCon(double meterNum1) {
    }
    public void secondNumCon(double meterNum2) {
        double meter_kilo = meterNum2 * 0.001;
    }
    public void thirdNumCon(double meterNum3) {
        double meter_miles = meterNum3  * 0.000621371192;
    }
}

class Kilometer extends LengthConvert {
    public void firstNumCon(double kilometerNum1) {
    }
    public void secondNumCom(double kilometerNum2) {
        double kilo_meter = kilometerNum2 * 1000;
    }
    public void thirdNumCon(double kilometerNum3) {
        double kilometer_miles = kilometerNum3 * 0.62137119;
    }
}

class Miles extends LengthConvert {
    public void firstNumCon(double milesNum1) {
    }
    public void secondNumCon(double milesNum2) {
        double miles_meter = milesNum2 * 1609.34;
    }
    public void thirdNumCon(double milesNum3) {
        double miles_meter = milesNum3 * 1.60934;
    }
}