import java.util.Scanner;

public class EventSuggestion {

	public static void main(String[] args) {
		/*
		 * Hava Sıcaklığını al
		 * Sıcaklık 30 veya daha yüksekse yüzme etkinliğini öner
		 * 5 ve 30 arasında ise sinema öner
		 * 4 ve daha az ise kayak yapmayı öner
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int sicaklik;
		
		System.out.print("Hava Sıcaklığını Giriniz: ");
		sicaklik = scanner.nextInt();
		
		if (sicaklik > 30) {
			System.out.println("Bu havada yüzmeye gidilir");
		} else if (sicaklik >= 5 && sicaklik <= 30) {
			System.out.println("Bu havada en iyi sinemaya gidilir");
		} else {
			System.out.println("Bu havada kayak yapmaya gidilir");
		}
		
		scanner.close();
	}

}
