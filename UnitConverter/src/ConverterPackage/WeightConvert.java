package ConverterPackage;

class WeightConvert {
    public void secondWeightCon(double weightNumConversion1) {};
    public void thirdWeightCon(double weighNumConversion2) {};
}

class Grams extends WeightConvert {
    public void secondWeightCon(double gramsNum2) {
        double g_kg = gramsNum2/1000;
        System.out.println("Grams to Kilograms: " + g_kg);
    }

    public void thirdWeightCon(double gramsNum3) {
        double g_pounds = gramsNum3 * 0.00220462;
        System.out.println("Grams to Pounds: " + g_pounds);

    }
}
class Kilograms extends Grams {
    public void secondWeightCon(double kgNum2) {
        double kg_g = kgNum2  * 1000;
        System.out.println("Kilograms to Grams: "+kg_g);
    }


    public void thirdWeightCon(double kgNum3) {
        double kg_pounds = kgNum3 * 2.20462;
        System.out.println("Kilograms to Pounds: " + kg_pounds);
    }
}

class Pounds extends Kilograms {
    public void secondWeightCon(double poundsNum2) {
        double pound_g = poundsNum2 * 453.592;
        System.out.println("Pounds to Grams: " + pound_g);
    }

    public void thirdWeightCon(double poundsNum3) {
        double pound_kg = poundsNum3 * 0.453592;
        System.out.println("Pounds to Kilograms: " + pound_kg);

    }
}