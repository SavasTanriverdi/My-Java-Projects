
public class Overloading {


	// İki tamsayıyı toplayan metot
    static int add(int a, int b) {
        System.out.println("1. Metot: İki tamsayı toplandı.");
        return a + b;
    }

    // Üç tamsayıyı toplayan metot
    static int add(int a, int b, int c) {
        System.out.println("2. Metot: Üç tamsayı toplandı.");
        return a + b + c;
    }

    // Bir tamsayı ve bir double'ı toplayan metot
    static double add(int a, double b) {
        System.out.println("3. Metot: Bir tamsayı ve bir ondalık sayı toplandı.");
        return a + b;
    }

    // Bir double ve bir tamsayıyı toplayan metot
    static double add(double a, int b) {
        System.out.println("4. Metot: Bir ondalık sayı ve bir tamsayı toplandı.");
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sonuç 1: " + add(1, 2));
        System.out.println("Sonuç 2: " + add(1, 2, 5));
        System.out.println("Sonuç 3: " + add(1, 7.0));
        System.out.println("Sonuç 4: " + add(1.0, 2));
    }
}