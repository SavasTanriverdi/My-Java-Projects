import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args) {
        double amount, priceWithVAT, VAT;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the Amount of the Product: ");
        amount = inputScanner.nextDouble();

        System.out.println("Enter the VAT Rate (%): ");
        VAT = inputScanner.nextDouble() / 100;

        priceWithVAT = amount + (amount * VAT);
        System.out.printf("Price with VAT: %.2f\n", priceWithVAT);
    }

}
