package inheritance.src;

public class Main {
    // ?Inheritance yani Miras bırakma.
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employe employe = new Employe();

        EmployeManager employeManager = new EmployeManager();
        CustomerManager customerManager = new CustomerManager();
    }
}
