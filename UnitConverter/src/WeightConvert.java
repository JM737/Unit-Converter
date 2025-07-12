abstract class WeightConvert {
    public void firstWeightCon() {};
    public void secondWeightCon() {};
    public void thirdWeightCon() {};
}

class Grams extends WeightConvert {
    public void firstWeightCon(double gramsNum1) {
        System.out.println(gramsNum1);
    }

    public void secondWeightCon(double gramsNum2) {
        double g_kg = gramsNum2/1000;
        System.out.println(g_kg);
    }


    public void thirdWeightCon(double gramsNum3) {
        double g_pounds = gramsNum3 * 0.00220462;
        System.out.println(g_pounds);

    }
}
class Kilograms extends Grams {

    public void firstWeightCon(double kgNum1) {
        super.firstWeightCon(kgNum1);

    }


    public void secondWeightCon(double kgNum2) {
        double kg_g = kgNum2  * 1000;
        System.out.println(kg_g);
    }


    public void thirdWeightCon(double kgNum3) {
        double kg_pounds = kgNum3 * 2.20462;

    }
}

class Pounds extends Kilograms {

    public void firstWeightCon(double poundsNum1) {
        super.firstWeightCon(poundsNum1);
    }


    public void secondWeightCon(double poundsNum2) {
        double pound_g = poundsNum2 * 453.592;
        System.out.println(pound_g);
    }

    public void thirdWeightCon(double poundsNum3) {
        double pound_kg = poundsNum3 * 0.453592;
        System.out.println(pound_kg);

    }
}