package classeswithattibutes.src;

public class Main {
    public static void main(String[] args) {

        // *Nesne Yaratma & Nesnenin İçeriği
        Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Black");

        ProductManager productManager = new ProductManager();
        
        // *Ekrana Yansıtma
        productManager.AddOne(product);
        productManager.AddTwo(1, "null", "null", 2, 200);
    }
}
