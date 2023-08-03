package inheritancedemo.src;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        
        creditUI.CalculateLoan(new TeacherCreditManager());
        creditUI.CalculateLoan(new SoldierLoanManager());
    }
}