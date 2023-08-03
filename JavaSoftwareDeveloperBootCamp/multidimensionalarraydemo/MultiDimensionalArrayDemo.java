package multidimensionalarraydemo;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        // 2 boyutlu diziye Amerika'daki şehirleri ekle
        cities[0][0] = "New York";
        cities[0][1] = "Los Angeles";
        cities[0][2] = "Chicago";
        cities[1][0] = "Houston";
        cities[1][1] = "Phoenix";
        cities[1][2] = "Philadelphia";
        cities[2][0] = "San Antonio";
        cities[2][1] = "San Diego";
        cities[2][2] = "Dallas";

        // Şehirleri ekrana yazdırmak için 2 boyutlu dizi üzerinde döngü
        for (int i = 0; i < 3; i++) {
            System.out.println("--------------------------");
            for (int j = 0; j < 3; j++) {
                System.out.println(cities[i][j]);
            }
        }
        System.out.println("--------------------------");
    }
}
