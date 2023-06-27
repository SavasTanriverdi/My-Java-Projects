import java.util.Scanner;

public class DaireAlanveHacimHesaplama {

	public static void main(String[] args) {
		int r;
		double area, volume, pi = 3.14;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle: \n");
		r = inputScanner.nextInt();
		area = 2 * pi * r;
		volume = pi * (r * r);
		System.out.println("Circle Area: " + area);
		System.out.println("Circle Volume: " + volume);
	}
}
