package src;

public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'A';

        // switch ifadesi, grade değişkeninin değerine göre farklı durumlar için kod
        // bloklarını çalıştırır.
        switch (grade) {
            // Eğer grade 'A' ise bu blok çalışacak
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;

            // Eğer grade 'B' ise bu blok çalışacak
            case 'B':
                System.out.println("Çok Güzel: Geçtiniz");
                break;

            // Eğer grade 'C' ise bu blok çalışacak
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;

            // Eğer grade 'D' ise bu blok çalışacak
            case 'D':
                System.out.println("Fena Değil: Geçtiniz");
                break;

            // Eğer grade 'F' ise bu blok çalışacak
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;

            // Eğer grade yukarıdaki durumlardan herhangi birine uymuyorsa bu blok çalışacak
            default:
                System.out.println("Geçersiz Not Girdiniz!");
        }
    }
}
