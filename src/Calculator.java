import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi1, sayi2, secim;
		
		System.out.print("Ilk sayiyi Giriniz: ");
		sayi1 = scanner.nextInt();
		
		System.out.print("Ikinci sayiyi giriniz: ");
		sayi2 = scanner.nextInt();
		
		System.out.println("Yapilacak islemi secin:");
		System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
		System.out.print("Seçiminiz: ");
		secim = scanner.nextInt();
		
		switch (secim) {
			case 1:
				System.out.println("Toplam: " + (sayi1 + sayi2));
				break;
			case 2:
				System.out.println("Cikarma: " + (sayi1 - sayi2));
				break;
			case 3:
				System.out.println("Carpma: " + (sayi1 * sayi2));
				break;
			case 4:
				if (sayi2 == 0) {
					System.out.println("Ikinci Sayi 0'a esit olamaz");
				} else {
					System.out.println("Bolme: " + (sayi1 / sayi2));
				}
				break;
			default:
				System.out.println("Gecersiz bir islem yaptiniz!");
		}
		
		scanner.close();
	}
}
