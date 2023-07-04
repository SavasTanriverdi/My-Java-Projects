import java.util.Scanner;

public class ImprovedEbobEkok {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2;
        System.out.println("Please enter two numbers: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        
        int ebob = calculateGCD(n1, n2);
        int ekok = calculateLCM(n1, n2, ebob);
        
        System.out.println("Ekok of " + n1 + " and " + n2 + ": " + ekok);
        System.out.println("Ebob of " + n1 + " and " + n2 + ": " + ebob);
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
