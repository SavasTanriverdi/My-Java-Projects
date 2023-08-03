package stringmanipulationdemoone.src;

public class StringManipulationDemoOne {

    public static void main(String[] args) {
        String sentence = "It's a beautiful day today.";
        printSentenceInfo(sentence);
        printSubstring(sentence, 5, 10);
        appendText(sentence, " Hooray!");
        printSentenceInfo(sentence);
    }

    private static void printSentenceInfo(String sentence) {
        System.out.println("Sentence: " + sentence);
        System.out.println("Number of Characters: " + sentence.length());
        System.out.println("First Character: " + sentence.charAt(0));
        System.out.println("Last Character: " + sentence.charAt(sentence.length() - 1));
        System.out.println("Starts with 'I': " + sentence.startsWith("I"));
        System.out.println("Ends with '.': " + sentence.endsWith("."));
        char[] characters = new char[5];
        sentence.getChars(0, 5, characters, 0);
        System.out.println("First 5 Characters: " + new String(characters));
        System.out.println("Index of 'a': " + sentence.indexOf("a"));
        System.out.println("Last Index of 'a': " + sentence.lastIndexOf("a"));
        System.out.println();
    }

    private static void printSubstring(String sentence, int startIndex, int endIndex) {
        if (startIndex >= 0 && startIndex < sentence.length() && endIndex <= sentence.length()) {
            System.out.println("Substring [" + startIndex + ", " + endIndex + "]: " + sentence.substring(startIndex, endIndex));
        } else {
            System.out.println("Invalid start or end index for substring.");
        }
        System.out.println();
    }

    private static void appendText(String sentence, String textToAppend) {
        StringBuilder sb = new StringBuilder(sentence);
        sb.append(textToAppend);
        sentence = sb.toString();
    }
}
