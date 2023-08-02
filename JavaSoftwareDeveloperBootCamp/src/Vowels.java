package src;

public class Vowels {
    public static void main(String[] args) {
        char letter = 'I';

        // Not: Bu tür küçük programlarda, genellikle harflerin büyük veya küçük olmasına dikkat etmek önemlidir.
        // Kullanıcıdan veya veriden gelen harfler büyük veya küçük olabilir, bu nedenle girişleri dikkatlice ele almak gerekir.
        // Örneğin, 'i' küçük harf olarak girildiğinde sesli harf olduğunu belirlemek için ek durumlar eklemek gerekebilir.

        switch (Character.toUpperCase(letter)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Bold Vowel Letter");
                break;
            default:
                System.out.println("Thin Vowel Letter");
        }
    }
}
