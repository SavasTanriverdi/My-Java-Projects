package conditionals.src;

public class Conditionals {
    public static void main(String[] args) {
        int number = 20;

        if (number < 20) {
            System.out.println("Sayı 20'den küçüktür.");
        } else if (number == 20) {
            System.out.println("Sayı 20'ye eşittir.");
        } else {
            System.out.println("Sayı 20'den büyüktür.");
        }

        // *Başka bir koşul örneği
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Hava yağmurlu.");
        } else {
            System.out.println("Hava yağmurlu değil.");
        }
    }
}
