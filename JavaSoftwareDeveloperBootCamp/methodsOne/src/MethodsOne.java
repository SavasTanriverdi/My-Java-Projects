package methodsOne.src;

public class MethodsOne {
    public static void main(String[] args) {
        numberFinding();
    }

    // *Metotdumuzun İsmi "numberFinding"
    public static void numberFinding() {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int toBeSearched = 5;
        boolean found = false; // Aranan sayının bulunup bulunmadığını kontrol etmek için bir boolean değişken

        for (int i = 0; i < numbers.length; i++) {
            if (toBeSearched == numbers[i]) {
                System.out.println("There's a dialed number in the series. " + numbers[i]);
                found = true; // Aranan sayı bulunduğunda found değeri true olarak işaretlenir.
                break; // Aranan sayıyı bulduğumuzda döngüden çıkabiliriz.
            }
        }

        if (!found) { // Eğer aranan sayı bulunmadıysa, yani found değeri hala false ise:
            System.out.println("The dialed number is not in the series.");
        }
    }

    public static void sendAMessage() {

    }
}
