package recapdemo_classes.src;

public class FourOperations {
    public int collect(int numberOne, int numberTwo) { 
        return numberOne + numberTwo;
    }

    public int takeOut(int numberOne, int numberTwo) { 
        return numberOne - numberTwo;
    }

    public int multiply(int numberOne, int numberTwo) { 
        return numberOne * numberTwo;
    }

    public int divide(int numberOne, int numberTwo) { 
        if (numberTwo != 0) { // Not: Bölme işleminde sıfıra bölünme hatasını önlemek için kontrol eklenmiştir.
            return numberOne / numberTwo;
        } else {
            throw new ArithmeticException("Cannot divide by zero!"); // Not: Sıfıra bölme hatası olursa bir istisna (exception) fırlatılır.
        }
    }
}
