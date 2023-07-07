import java.util.Scanner;

public class AtmProject {

    public static void main(String[] args) {

        int bakiye = 1000, input, miktar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Merhabalar Hoşgeldiniz");
        System.out.println("Güncel Bakiyeniz: " + bakiye + " TL");

        while (bakiye > 0) {
            System.out.println();
            System.out.println("(1-) Para Yatır");
            System.out.println("(2-) Para Çek");
            System.out.println("(3-) Bakiye Sorgula");
            System.out.println("(4-) Çıkış Yap");
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz: ");
            input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Yatırmak İstediğiniz Miktar: ");
                miktar = scanner.nextInt();
                bakiye += miktar;
            } else if (input == 2) {
                System.out.println("Çekmek İstediğiniz Miktar: ");
                miktar = scanner.nextInt();
                if (miktar > bakiye) {
                    System.out.println("Yetersiz Bakiye");
                } else {
                    bakiye -= miktar;
                }
            } else if (input == 3) {
                System.out.println("Güncel Bakiyeniz: " + bakiye);
            } else if (input == 4) {
                System.out.println("Çıkış yapılıyor!!");
                break; // Döngüyü sonlandır
            } else {
                System.out.println("Geçersiz Bir İşlem Girdiniz!!");
            }
        }

        System.out.println("Tekrar Bekleriz!");
    }
}
