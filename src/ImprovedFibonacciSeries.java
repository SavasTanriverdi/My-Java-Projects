import java.util.Scanner;

public class ImprovedFibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int input = scanner.nextInt();
        
        System.out.println("Fibonacci series up to " + input + ":");
        
        int n1 = 0, n2 = 1;
        
        for (int i = 1; i <= input; i++) {
            System.out.print(n1);
            
            if (i != input) {
                System.out.print(", ");
            }
            
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        
        System.out.println();
    }
}
