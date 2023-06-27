import java.util.Scanner;

public class KonsoldanVeriAlma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Enter the value of A: ");
		a = input.nextInt();
		System.out.println("Enter the value of B: ");
		b = input.nextInt();
		System.out.println("Value of A: " + a);
		System.out.println("Value of B: " + b);
		
		double c;
		System.out.println("Enter a number of type Double: ");
		c = input.nextDouble();
		System.out.println(c);
		
		String str;
		System.out.println("Enter a String: ");
		input.nextLine(); // Consume the newline character from the previous input
		str = input.nextLine();
		System.out.println(str);
		
	}
}
