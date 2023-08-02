package src;

public class NumberOfFriends {

    // İki sayının bölenlerinin toplamını hesaplayan fonksiyon
    public static int sumOfDivisors(int number) {
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int numberOne = 220;
        int numberTwo = 284;

        int totalOne = sumOfDivisors(numberOne);
        int totalTwo = sumOfDivisors(numberTwo);

        if (totalOne == numberTwo && totalTwo == numberOne) {
            System.out.println(numberOne + " And " + numberTwo + " Friends are Numbers.");
        } else {
            System.out.println(numberOne + " And " + numberTwo + " Friend is not a number.");
        }
    }
}
