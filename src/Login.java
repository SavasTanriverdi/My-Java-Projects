import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String userNameString, passowrdString;
        
        System.out.println("Enter username: ");
        userNameString = scanner.nextLine();
        
        System.out.println("Enter password: ");
        passowrdString = scanner.nextLine();
        
        // Kullanıcı adı ve parola doğrulama
        if (userNameString.equals("java") && passowrdString.equals("123")) {
            System.out.println("You have successfully logged in");
        } else {
            System.out.println("Your username or password is incorrect");
        }

    }

}
/*
- Scanner sınıfını kullanarak kullanıcıdan giriş alıyorsunuz.
- userNameString ve passwordString değişkenleri kullanıcı adı ve parolayı depolamak için kullanılıyor.
- Kullanıcı adı ve parolayı doğrulamak için equals() yöntemini kullanıyorsunuz.
- Kullanıcı adı "java" ve parola "123" ile eşleştiğinde başarılı giriş mesajı yazdırılıyor.
- Eşleşme olmadığında kullanıcıya hatalı giriş mesajı yazdırılıyor.
*/