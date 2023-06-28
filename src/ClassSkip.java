import java.util.Scanner;

public class ClassSkip {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int turkce, matematik, fenbilgisi, bedenegitimi;
		double notOrtalamasi;
		
		System.out.print("Turkce Notunu Giriniz: ");
		turkce = scanner.nextInt();
		
		System.out.print("Matematik Notunu Giriniz: ");
		matematik = scanner.nextInt();
		
		System.out.print("Fenbilgisi Notunu Giriniz: ");
		fenbilgisi = scanner.nextInt();
		
		System.out.print("Bedenegitimi Notunu Giriniz: ");
		bedenegitimi = scanner.nextInt();
		
		notOrtalamasi = (turkce + matematik + fenbilgisi + bedenegitimi) / 4.0;
		System.out.println("Not Ortalamanız: " + notOrtalamasi);
		
		if (notOrtalamasi < 50) {
			System.out.println("Kaldınız Seneye Gorusuruz :)");
		}else if (notOrtalamasi >= 50) {
			System.out.println("Gectiniz");
		}
	}

}
