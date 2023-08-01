package src;

import java.util.Scanner;

public class Variables {
    // Sabitler genellikle büyük harflerle yazılır ve final anahtar kelimesiyle
    // tanımlanır
    public static final double PI = 3.14159265359;

    public static void main(String[] args) {
        // *İnt veri türünde bir değişken tanımlayalım ve değer atayalım
        int age = 30;
        System.out.println("Yaş: " + age);

        // *String veri türünde bir değişken tanımlayalım ve değer atayalım
        String name = "John Doe";
        System.out.println("İsim: " + name);

        // *Double veri türünde bir değişken tanımlayalım ve değer atayalım
        double salary = 5000.50;
        System.out.println("Maaş: " + salary);

        // *Değişken değerlerini değiştirelim
        int x = 5;
        int y = 10;
        x = x + y;
        System.out.println("x: " + x);

        // *Değişken değerlerini kullanarak hesaplamalar yapalım
        int total = x * y;
        System.out.println("Toplam: " + total);

        // *Sabiti kullanarak bir dairenin alanını hesaplayalım
        int radius = 5;
        double area = PI * radius * radius;
        System.out.println("Dairenin Alanı: " + area);

        // *Kullanıcıdan veri alma ve değişken kullanma
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen adınızı girin: ");
        String userName = scanner.nextLine();

        System.out.print("Lütfen yaşınızı girin: ");
        int userAge = scanner.nextInt();

        System.out.println("Merhaba, " + userName + "! Yaşınız: " + userAge);

        scanner.close();
    }
}
