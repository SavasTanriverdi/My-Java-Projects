import java.util.Scanner;

public class WhileExamples {

	public static void main(String[] args) {
		/*
		 * Örnek 1: 1'den 100'e kadar çift sayıları ekrana yazan program
		 * Örnek 2: Negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
		 * ve girilen değerlerden tek sayıları toplayan program
		 * Örnek 3: Girilen sayıya kadar olan 2'nin kuvvetleri
		 */
		
		/* ÖRNEK 1:
		int i =1;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		*/ 
		
		Scanner scanner = new Scanner(System.in);
		
		int toplam = 0;
		int input;
		
		while (true) {
			System.out.println("Lutfen sayi giriniz: ");
			input = scanner.nextInt();
			
			if (input < 0) {
				System.out.println("Program bitti negatif sayi girdiniz");
				System.out.println("girilen tek sayılar toplamı: " + toplam);
				break;
			}
			if (input % 2 == 1) {
				//toplam = toplam + input;
				toplam += input;
			}
		}
		
	}

}
