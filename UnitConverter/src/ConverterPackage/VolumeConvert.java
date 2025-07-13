package ConverterPackage;

public class VolumeConvert {
    public void secondVolumeCon(double meterVolume) {};
}
    class Liters extends VolumeConvert {
        public void secondVolumeCon(double litersNum2) {
            double liters_gallons = litersNum2 * 0.264172;
            System.out.println(liters_gallons);
        }
    }

    class Gallons extends Liters {
        public void secondVolumeCon(double gallonsNum2) {
            double gallons_liters = gallonsNum2 * 3.785;
            System.out.println(gallons_liters);
        }
    }
