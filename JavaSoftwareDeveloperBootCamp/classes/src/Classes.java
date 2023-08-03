package classes.src;

public class Classes {
    public static void main(String[] args) {
        // !Reference Type
        CustomerMananger customerMananger = new CustomerMananger();
        customerMananger.Add();
        customerMananger.Remove();
        customerMananger.Update();

        int numberOne = 10;
        int numberTwo = 20;
        numberTwo = numberOne;
        numberOne = 30;
        System.out.println(numberTwo);

        int[] numbersOne = new int[] { 1, 2, 3 };
        int[] numbersTwo = new int[] { 4, 5, 6 };
        numbersTwo = numbersOne;
        numbersOne[0] = 10;
        System.out.println(numbersTwo[0]);
    }
}