package src;

import java.net.SocketTimeoutException;

public class StringManipulationDemoTwo {
    public static void main(String[] args) {
        String message = "It's a beautiful day today.";
        System.out.println(message);

        String newMessage = message.replace(" ", "-");
        System.out.println("New message: " + newMessage);

        System.out.println(message.substring(2, 18));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
    }
}
