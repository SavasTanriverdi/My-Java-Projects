
public class MantiksalOperatorler {

	public static void main(String[] args) {
		
		//VE
		int a = 10, b = 20, c = 5, d = 50;
		
		boolean kosul1 = a < b, kosul2 = d > c, 
				sonuc = (kosul1 && kosul2);
		System.out.println(sonuc);
		
		//VEYA
		int x = 10, z = 20, t = 5, k = 50;
		
		boolean oncul1 = a > b, oncul2 = d > c, 
				netice = (oncul1 || oncul2);
		System.out.println(netice);
		
	}

}
