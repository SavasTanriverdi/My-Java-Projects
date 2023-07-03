import java.util.Scanner;

public class DoWhileLoopExamples {

	public static void main(String[] args) {
		/*
		 * Örnek 1: Negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
		 * ve girilen değerlerden çift sayıları toplayan program
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		int input, toplam = 0;
		
		while (true) {
			System.out.println("Lütfen sayi giriniz: ");
			input = scanner.nextInt();
			if (input < 0) {
				System.out.println("Program bitti negatif sayi girdiniz");
			}
			if (input % 2 == 1) {
				toplam += input;
				System.out.println("girilen tek sayılar toplamı: " + toplam);
			}
		}
		*/
		
		int input, toplam = 0;
		do {
			System.out.println("Lütfen sayi giriniz: ");
			input = scanner.nextInt();
			if (input %2 == 0) {
				toplam += input;
			}
		}while (input > 0);
		System.out.println("girilen tek sayılar toplamı: " + toplam);
	}

}
