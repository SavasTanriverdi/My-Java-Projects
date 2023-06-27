
public class Operatorler {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c;
		int addition = a + b;
		int subtraction = a - b;
		int multiplication = a * b;
		int division = a / b;
		int modulus = a % b;
		System.out.println("Addition: " + addition);
		System.out.println("Subtraction: " + subtraction);
		System.out.println("Multiplication: " + multiplication);
		System.out.println("Division: " + division);
		System.out.println("Modulus: " + modulus);
		addition++;
		System.out.println(addition);
		subtraction--;
		System.out.println(subtraction);
		
		int result = a++ + b--;
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
		
		int number1 = 10;
		int number2 = 5;
		
		boolean condition1 = (number1 == number2);
		System.out.println(condition1);
		
		boolean condition2 = (number1 > number2);
		System.out.println(condition2);
		
		boolean condition3 = (number1 / number2) == 2;
		System.out.println(condition3);
		
		boolean condition4 = (number1 > number2);
		boolean condition5 = (number1 < number2);
		
		// Logical AND
		boolean result1 = condition1 && condition2;
		System.out.println(result1);
		
		// Logical OR
		boolean result2 = condition1 || condition2;
		System.out.println(result2);
		
		number1 = number2;
		number1 += 2;
		System.out.println(number1);
		
	}
}
