package methodoverloading.src;

public class FourOperations {
    public int collect(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public int collect(int numberOne, int numberTwo, int numberThree) {
        return numberOne + numberTwo;
    }
}
