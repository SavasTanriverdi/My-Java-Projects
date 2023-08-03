package recapdemotwo.src;

public class ReCapDemoTwo {
    public static void main(String[] args) {

        double[] numbers = { 1.2, 1.3, 4.3, 5.6 };
        double total = 0;
        double max = numbers[0];

        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
            total += number;
        }

        System.out.println("Numbers:");
        for (double number : numbers) {
            System.out.println(number);
        }

        System.out.println("Total = " + total);
        System.out.println("Max = " + max);
    }
}
