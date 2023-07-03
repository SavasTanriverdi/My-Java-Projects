import java.util.Scanner;

public class WhileExamples2 {

	public static void main(String[] args) {
		// Örnek 1: Faktöriyel hesaplama
		// Örnek 2: Harmonik Sayılar
		// Örnek 3: Yıldızlar ile üçgen yapma
		// Örnek 4: Üslü sayı hesaplama
		
		/* Örnek 1:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Faktöriyel Sayisi giriniz: ");
		int f = scanner.nextInt();
		int sonuc = 1;
		while (f > 0) {
			sonuc *= f; 
			f--;
		}
		System.out.println("Sonuc " + sonuc);
		*/
		
		/* Örnek 2:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Faktöriyel sayısını giriniz: ");
		int f = scanner.nextInt();
		int sonuc = 1;
		while (f > 0) {
		    sonuc *= f; 
		    f--;
		}
		System.out.println("Sonuç: " + sonuc);
	*/
		/* Örnek 3:
		Scanner scanner = new Scanner(System.in);
		int star = scanner.nextInt();
		int i = 1;
		while (i <= star) {
		    int k = 1;
		    while (k <= i) {
		        System.out.print("*");
		        k++;
		    }
		    System.out.println();
		    i++;
		}
		*/
		//Örnek 4:
		Scanner scanner = new Scanner(System.in);
		int sayi1, sayi2, sonuc = 1;
		System.out.println("Üssü alınacak sayı: ");
		sayi1 = scanner.nextInt();
		System.out.println("Üs olacak sayı: ");
		sayi2 = scanner.nextInt();
		int i = 1;
		while (i <= sayi2) {
		    sonuc = sonuc * sayi1;
		    i++;
		}
		System.out.println("Sonuç: " + sonuc);

	}

}
