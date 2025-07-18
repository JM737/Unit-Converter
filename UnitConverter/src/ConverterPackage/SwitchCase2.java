package ConverterPackage;
import java.util.Scanner;
public class SwitchCase2 {
    private final Scanner scanner;
    private final PhilippinePeso dollar, euro, pound, yen, rupee, australianDollar, canadianDollar, singaporeDollar, swissFranc, chineseYuan;
    public SwitchCase2() {
        scanner = new Scanner(System.in);
        dollar = new PesoToDollar();
        euro = new PesoToEuro();
        pound = new PesoToPound();
        yen = new PesoToYen();
        rupee = new PesoToRupee();
        australianDollar = new PesoToAustralianDollar();
        canadianDollar = new PesoToCanadianDollar();
        singaporeDollar = new PesoToSingaporeDollar();
        swissFranc = new PesoToSwissFranc();
        chineseYuan = new PesoToChineseYuan();
    }
    public static void displayCurrencyCon() {
        System.out.print(""" 
                    [   CURRENCY CONVERTER  ]
                Please choose a conversion type:
                1. Philippine Peso to Dollar
                2. Philippine Peso to Euro
                3. Philippine Peso to Pound
                4. Philippine Peso to Yen
                5. Philippine Peso to Rupee
                6. Philippine Peso to Australian Dollar
                7. Philippine Peso to Canadian Dollar
                8. Philippine Peso to Singapore Dollar
                9. Philippine Peso to Swiss Franc
                10. Philippine Peso to Chinese Yuan
                11. Exit
                Enter your choice (1-11):\s""");
    }
    public void currencyConversion() {
        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Enter the amount in Philippine Peso (PHP): ");
        double pesoAmount = scanner.nextDouble();

        System.out.println("Choose the currency to convert to:");
        System.out.println("1. Dollar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Pound (GBP)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Rupee (INR)");
        System.out.println("6. Australian Dollar (AUD)");
        System.out.println("7. Canadian Dollar (CAD)");
        System.out.println("8. Singapore Dollar (SGD)");
        System.out.println("9. Swiss Franc (CHF)");
        System.out.println("10. Chinese Yuan (CNY)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                dollar.pesoExchange(pesoAmount);
                break;
            case 2:
                euro.pesoExchange(pesoAmount);
                break;
            case 3:
                pound.pesoExchange(pesoAmount);
                break;
            case 4:
                yen.pesoExchange(pesoAmount);
                break;
            case 5:
                rupee.pesoExchange(pesoAmount);
                break;
            case 6:
                australianDollar.pesoExchange(pesoAmount);
                break;
            case 7:
                canadianDollar.pesoExchange(pesoAmount);
                break;
            case 8:
                singaporeDollar.pesoExchange(pesoAmount);
                break;
            case 9:
                swissFranc.pesoExchange(pesoAmount);
                break;
            case 10:
                chineseYuan.pesoExchange(pesoAmount);
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }
}
