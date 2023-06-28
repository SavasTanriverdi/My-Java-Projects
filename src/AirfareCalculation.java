import java.util.Scanner;

public class AirfareCalculation {

	public static void main(String[] args) {
		/*
		  KM birim fiyatı: 0.10TL
		  12 yaşından küçükse toplam fiyata %50 indirim
		  12 ve 24 yaş arasında %10 indirim
		  65 yaşından büyükse %30 indirim 
		  Gidiş dönüş alırsa %20 indirim
		  Bu koşullara göre uçak bileti fiyatını hesaplayan program
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int yas, tip, km;
		double birimFiyat = 0.10;
		double toplamFiyat;
		
		System.out.print("Mesafeyi Giriniz: ");
		km = scanner.nextInt();
		
		System.out.print("Yasinizi Giriniz: ");
		yas = scanner.nextInt();
		
		System.out.print("Yolculuk tipini seciniz (1-Tek gidis, 2-Gidis/Donus): ");
		tip = scanner.nextInt();
		
		if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
			toplamFiyat = km * birimFiyat; // Başlangıçta toplam fiyatı km ile çarpılan birim fiyat ile hesaplıyoruz
			
			if (yas < 12) { // 12 yaşından küçükse %50 indirim
				toplamFiyat *= 0.5;
			} else if (yas >= 12 && yas <= 24) { // 12 ve 24 yaş arasında %10 indirim
				toplamFiyat *= 0.9;
			} else if (yas >= 65) { // 65 yaşından büyükse %30 indirim
				toplamFiyat *= 0.7;
			}
			
			if (tip == 2) { // Gidiş dönüş alınırsa %20 indirim
				toplamFiyat *= 0.8;
			}
			
			System.out.println("Toplam Bilet Fiyati: " + toplamFiyat + " TL");
		} else {
			System.out.println("Girdiler yanlis");
		}
		
		scanner.close();
	}

}
