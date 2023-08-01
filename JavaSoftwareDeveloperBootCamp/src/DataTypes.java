package src;

public class DataTypes {
    public static void main(String[] args) {
        
        // !PRİMİTİVE TYPES
        
        /*
         * boolean: Mantıksal değerler true veya false. Genellikle koşullarda kullanılır.
         */
        boolean isRaining = true;
        boolean isSunny = false;
        System.out.println("Is it raining? " + isRaining);
        System.out.println("Is it sunny? " + isSunny);

        /*
         * char: Tek karakteri temsil eder. Örneğin 'A', 'b', '?', '8' gibi.
         */
        char firstLetter = 'A';
        char secondLetter = 'B';
        System.out.println("First letter: " + firstLetter);
        System.out.println("Second letter: " + secondLetter);

        /*
         * byte: 8 bit ile temsil edilen bir tamsayı türüdür. Değer aralığı -128 ile 127 arasındadır.
         */
        byte myByte = 100;
        System.out.println("Byte value: " + myByte);

        /*
         * short: 16 bit ile temsil edilen bir tamsayı türüdür. Değer aralığı -32,768 ile 32,767 arasındadır.
         */
        short myShort = 30000;
        System.out.println("Short value: " + myShort);

        /*
         * int: 32 bit ile temsil edilen bir tamsayı türüdür. Değer aralığı -2^31 ile (2^31)-1 arasındadır.
         */
        int myInt = 1000000;
        System.out.println("Integer value: " + myInt);

        /*
         * long: 64 bit ile temsil edilen bir tamsayı türüdür. Değer aralığı -2^63 ile (2^63)-1 arasındadır.
         */
        long myLong = 12345678900L; // L harfi long veri türünü belirtir.
        System.out.println("Long value: " + myLong);

        /*
         * float: Ondalıklı sayıları temsil eder. Tek duyarlıklı nokta (floating-point) türüdür.
         */
        float pi = 3.14f; // f harfi float veri türünü belirtir.
        System.out.println("Pi value: " + pi);

        /*
         * double: Daha yüksek hassasiyetli ondalıklı sayıları temsil eder. Çift duyarlıklı nokta (floating-point) türüdür.
         */
        double price = 99.99;
        System.out.println("Price value: " + price);
    }
}
