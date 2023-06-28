
public class WhileLoop {

	public static void main(String[] args) {
		
		int i = 1;
		System.out.println("Dongu Basladi");
		/*
		while (i <= 5) {
			System.out.println(i++);
		}
		*/
		do {
			System.out.println(i++);
		} while (i <= -1);
		
		System.out.println("Dongu Bitti");
	}

}
