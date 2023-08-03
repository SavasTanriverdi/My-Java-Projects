package methodsTwo.src;

public class MethodsTwo {
    public static void main(String[] args) {
        String message = "Beautiful weather today";
        System.out.println(message);

        String cityName = getCityName(); // Not: "getCityName()" metodu adı daha açıklayıcı ve anlaşılır hale getirildi.
        System.out.println(cityName);

        int sumOfNumbers = add(5, 4); // Not: "collection()" yerine "add()" metodu kullanılarak iki sayıyı toplamak için düzenleme yapıldı.
        System.out.println(sumOfNumbers);

        int collect = addTwo(1, 2, 3, 4, 5);
        System.out.println(collect);
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static String getCityName() {
        return "Ankara";
    }

    public static int addTwo(int... numbers) { // Not: "addTwo()" metodu, değişken sayıda parametreleri toplayarak sonucu döndürür.
        int collect = 0;
        for (int number : numbers) {
            collect += number;
        }
        return collect;
    }
}