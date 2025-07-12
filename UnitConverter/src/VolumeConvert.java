public class VolumeConvert {
    public void firstVolumeCon() {};
    public void secondVolumeCon() {};
}
    class Liters extends VolumeConvert {
        public void firstVolumeCon(double litersNum1) {
            System.out.println(litersNum1);
        }

        public void secondVolumeCon(double litersNum2) {
            double liters_gallons = litersNum2 * 0.264172;
            System.out.println(liters_gallons);
        }
    }

    class Gallons extends Liters {
        public void firstVolumeCon(double gallonsNum1) {
            super.firstVolumeCon(gallonsNum1);
        }

        public void secondVolumeCon(double gallonsNum2) {
            double gallons_liters = gallonsNum2 * 3.785;
            System.out.println(gallons_liters);
        }
    }
