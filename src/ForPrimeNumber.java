import java.util.Iterator;
import java.util.Scanner;

public class ForPrimeNumber {

	public static void main(String[] args) {
		// Finding a prime number
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		
		boolean prime = true;
		
		do {
			System.out.println("Please enter a positive number: ");
			input = scanner.nextInt();
		} while (input < 2);
		
		for (int i = 2; i < input; i++) {
			if (input %i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println("Entered number: " + input + " is prime.");
		}else {
			System.out.println("Entered number " + input + " not prime.");
		}
	}

}
