package classeswithattibutes.src;

public class Product {
    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        // *Yapıcı Metot ; Constructor
        System.out.println("Yapıcı Blok Çalıştı");
    }

    public Product() {

    }

    // !Attribute & Field
    private String _name, _description, _code;
    private double _price;
    private int _id, _stockAmount;

    // getter
    public String getname() {
        return _name;
    }

    // setter
    public void setname(String name) {
        // !"this" İçerisinde Bulunduğun Classı Kast Eder
        this._name = name;
    }

    public String getdescription() {
        return _description;
    }

    public void setdescription(String description) {
        // !"this" İçerisinde Bulunduğun Classı Kast Eder
        this._description = description;
    }

    public String getcode() {
        return _code;
    }

    public void setcode(String code) {
        this._code = code;
    }

    public double getprice() {
        return _price;
    }

    public void setprice(double price) {
        this._price = price;
    }

    public int getid() {
        return _id;
    }

    public void setid(int id) {
        this._id = id;
    }

    public int getstockAmount() {
        return _stockAmount;
    }

    public void setstockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }
}
