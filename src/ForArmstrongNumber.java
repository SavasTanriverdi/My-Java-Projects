
public class ForArmstrongNumber {

	public static void main(String[] args) {
		
		/*
		 * 153 = (1*1*1) + (5*5*5) + (3*3*3)
		 * 371 = (3*3*3) + (7*7*7) + (1*1*1)
		 * A program that finds Armstrong numbers
		 */
		
		int temp, ones, tens, hundreds, total;
		
		for (int i = 100; i <= 999; i++) {
			temp = i;
			
			ones = temp % 10;
			temp /= 10;
			
			tens = temp % 10;
			temp /= 10;
			
			hundreds = temp % 10;
			temp /= 10;
			
			total = (ones*ones*ones) + (tens*tens*tens) + (hundreds*hundreds*hundreds);
			
			if (total == i) {
				System.out.println(i + " is an Armstrong number.");
			}
		}
	}

}
