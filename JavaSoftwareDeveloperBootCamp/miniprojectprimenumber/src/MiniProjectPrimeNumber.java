package miniprojectprimenumber.src;

public class MiniProjectPrimeNumber {
    public static void main(String[] args) {
        int number = 1;
        boolean isPrime = true;

        // Not: Asal sayılar, 1 ve kendisi dışında hiçbir sayıya tam bölünemez.
        // Bu nedenle, 2'den başlayarak sayıyı yarısına kadar olan değerlere kadar bölmek yeterlidir.
        // Eğer bir bölen bulunursa, isPrime değeri false olarak ayarlanır ve döngüden çıkılır.
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break; // Döngüden çıkılır, çünkü artık asal olmadığı zaten belli.
            }
        }

        if (isPrime) {
            System.out.println("The number is Prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }
}
