package src;

public class LoopDemo {
    public static void main(String[] args) {
        // For Döngüsü
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Dögüsü Bitti!");

        // While Döngüsü
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            // Eğer "i++" Olmazsa Sonsuz Dögüye girer
            i++;
        }

        System.out.println("While Dögüsü Bitti!");

        // Do-While Döngüsü
        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
