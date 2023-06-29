import java.util.Iterator;
import java.util.Scanner;

public class ContinueBreak {

	public static void main(String[] args) {
		// Break => döngüyü durdurur
		// continue => döngüyü durdurmaz ama bir sonraki adıma gider
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		int sayi;
		
		while (true) {
			System.out.println("Bir sayi girin: " );
			sayi = scanner.nextInt();
			if (sayi == 0) {
				System.out.println("Dögü bitti");
				break;
			}
			System.out.println(sayi);
		}
		*/
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 3 || i ==9) {
				System.out.println("atladıi: " + i);
				continue;
			}
			System.out.println("i: " + i);
		}
		
	}

}
