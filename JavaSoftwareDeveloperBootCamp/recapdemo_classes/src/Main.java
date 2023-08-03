package recapdemo_classes.src;

public class Main {
    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        int result = fourOperations.collect(3, 4);
        System.out.println(result);
    }
}