import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi Giriniz: ");
		int sayi1 = scanner.nextInt();
		
		switch (sayi1) {
		case 1: {
			System.out.println("Sayi 1'e esittir");
			break;
		}
		case 2: {
			System.out.println("Sayi 2'ye esittir");
			break;
		}
			case 3: {
				System.out.println("Sayi 3'e esittir");
				break;
			}
			default: {
				System.out.println("Gecersiz bir sayi girdiniz");
			}
		}
	}

}
