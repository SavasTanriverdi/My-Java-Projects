
public class IfveElseBlokları {

	public static void main(String[] args) {
		int a = 50, b = 20, c = 20;
		if (a==b) {
			System.out.println("A ve B Sayileri Birbirine Esittir.");
		}else {
			System.out.println("A ve B Sayileri Birbirine Esit Degildir.");
		}
		if (b==c) {
			System.out.println("B ve C Sayileri Birbirine Esittir.");
		}else if (a > c) {
			System.out.println("A Buyuktur C'den");
		}else {
			System.out.println("B  ve C esit deyil");
		}
	}

}
