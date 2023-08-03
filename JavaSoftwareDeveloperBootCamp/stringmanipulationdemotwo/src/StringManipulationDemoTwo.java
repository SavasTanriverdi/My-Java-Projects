package stringmanipulationdemotwo.src;

public class StringManipulationDemoTwo {
    public static void main(String[] args) {
        String message = "It's a beautiful day today.";
        System.out.println(message);

        // Not: String'ler Java'da değiştirilemez (immutable) olduğundan, replace()
        // metodu yeni bir String döndürür.
        // Eğer değiştirmek istediğimiz String'i kullanmak istiyorsak, yeni halini
        // değişkene atamalıyız.
        String newMessage = message.replace(" ", "-");
        System.out.println("New message: " + newMessage);

        // Not: substring() metodu, belirtilen indeksler arasındaki alt diziyi döndürür.
        // İndekslerdeki karakterler de dahil olmak üzere [2, 18) aralığındaki alt dizi
        // dönecektir.
        System.out.println(message.substring(2, 18));

        // Not: split() metodu, bir String'i belirtilen ayracı kullanarak parçalayarak
        // bir dizi döndürür.
        // Bu durumda, boşlukları ayrac olarak kullanarak cümleyi kelimelere ayırır ve
        // her kelimeyi ayrı satırda yazdırır.
        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        // Not: String sınıfı değiştirilemez olduğundan, toLowerCase() ve toUpperCase()
        // metotları
        // orijinal String'i değiştirmez, yeni bir String döndürür. Eğer sonucu
        // kullanmak istiyorsak, yeni halini bir değişkene atamalıyız.
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
    }
}
