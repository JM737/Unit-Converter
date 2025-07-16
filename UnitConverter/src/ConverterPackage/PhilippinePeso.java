package ConverterPackage;

public class PhilippinePeso {
    public void pesoExchange (double pesoExchange) {}
}

class PesoToDollar extends PhilippinePeso {
    public void pesoExchange(double peso) {
        double dollar = peso / 56.0; // Example conversion rate
        System.out.println("Peso to Dollar: " + peso + " PHP = " + dollar + " USD");
    }
}

class PesoToEuro extends PhilippinePeso {
    public void pesoExchange(double peso) {
        double euro = peso / 60.0; // Example conversion rate
        System.out.println("Peso to Euro: " + peso + " PHP = " + euro + " EUR");
    }
}

class PesoToPound extends PhilippinePeso {
    public void pesoExchange(double peso) {
        double pound = peso / 70.0; // Example conversion rate
        System.out.println("Peso to Pound: " + peso + " PHP = " + pound + " GBP");
    }
}

class PesoToYen extends PhilippinePeso {
    public void pesoExchange(double peso) {
        double yen = peso * 0.45; // Example conversion rate
        System.out.println("Peso to Yen: " + peso + " PHP = " + yen + " JPY");
    }
}

class PesoToRupee extends PhilippinePeso {
    public void pesoExchange(double peso) {
        double rupee = peso * 0.75; // Example conversion rate
        System.out.println("Peso to Rupee: " + peso + " PHP = " + rupee + " INR");
    }
}

class PesoToAustralianDollar extends PhilippinePeso {
    public void pesoExchange(double peso) {
        double australianDollar = peso / 40.0; // Example conversion rate
        System.out.println("Peso to Australian Dollar: " + peso + " PHP = " + australianDollar + " AUD");
    }
}

class PesoToCanadianDollar extends PhilippinePeso {
    public void pesoExchange(double peso) {
        double canadianDollar = peso / 45.0; // Example conversion rate
        System.out.println("Peso to Canadian Dollar: " + peso + " PHP = " + canadianDollar + " CAD");
    }
}

class PesoToSingaporeDollar extends PhilippinePeso {
    public void pesoExchange(double peso) {
        double singaporeDollar = peso / 50.0; // Example conversion rate
        System.out.println("Peso to Singapore Dollar: " + peso + " PHP = " + singaporeDollar + " SGD");
    }
}

class PesoToSwissFranc extends PhilippinePeso {
    public void pesoExchange(double peso) {
        double swissFranc = peso / 55.0; // Example conversion rate
        System.out.println("Peso to Swiss Franc: " + peso + " PHP = " + swissFranc + " CHF");
    }
}

class PesoToChineseYuan extends PhilippinePeso {
    public void pesoExchange(double peso) {
        double chineseYuan = peso / 8.0; // Example conversion rate
        System.out.println("Peso to Chinese Yuan: " + peso + " PHP = " + chineseYuan + " CNY");
    }
}