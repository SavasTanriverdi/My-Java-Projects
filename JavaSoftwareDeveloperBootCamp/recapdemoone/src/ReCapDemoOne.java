package recapdemoone.src;

public class ReCapDemoOne {
    public static void main(String[] args) {
        int numberOne = 20, numberTwo = 25, numberThree = 2;
        int enBuyuk = numberOne;

        if (enBuyuk < numberTwo) {
            enBuyuk = numberTwo;
        }

        if (enBuyuk < numberThree) {
            enBuyuk = numberThree;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
    }
}
