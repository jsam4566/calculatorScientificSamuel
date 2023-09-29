import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        //Handle Currency Conversion
        System.out.println("Currency Conversion:");
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the source currency... [OPTIONS TO CHOOSE FROM]: USD, LIRA, DONG, POUND, KRONA, FRANC, RIYAL, RAND & RUPEE): ");
        String sourceCurrency = scanner.next().toUpperCase();
        System.out.print("Enter the target currency... [OPTIONS TO CHOOSE FROM]: USD, LIRA, DONG, POUND, KRONA, FRANC, RIYAL, RAND & RUPEE): ");
        String targetCurrency = scanner.next().toUpperCase();
        double exchangeRate = Converter.getExchangeRate(sourceCurrency, targetCurrency);
        if (exchangeRate == -1.0) {
            System.out.println("Invalid currency method.");
        } else {
            double convertedAmount = Converter.convertCurrency(amount, exchangeRate);
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Converted amount: " + df.format(convertedAmount) + " " + targetCurrency);
        }


        scanner.close();

    }

}
