package arraysdemo.src;

public class ArraysDemo {
    public static void main(String[] args) {
        // Öğrenci isimleri tek tek tanımlanıyor
        String studentOne = "John";
        String studentTwo = "Charly";
        String studentThree = "Emily";
        String studentFour = "Maria";

        // Her öğrenci ismi ayrı ayrı yazdırılıyor
        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentThree);
        System.out.println(studentFour);

        System.out.println("---------------------------");

        // Bir dizi bu şekilde tanımlanır
        String[] students = new String[3]; // Dizi 3 elemanlı olarak tanımlandı

        // Dizi elemanlarına değerler atanıyor
        students[0] = "John";
        students[1] = "Charly";
        students[2] = "Emily";

        // Dizi elemanları for döngüsü kullanılarak yazdırılıyor
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
