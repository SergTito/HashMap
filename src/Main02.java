import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main02 {
    //Search for the most frequently occurring word in the text
    //Write a program that reads a text string from the keyboard and determines the most
    // frequently occurring word in the text. Use HashMap to count the number of occurrences of each word.
    // Display the most frequently occurring word on the screen.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text :");
        String inputText = scanner.nextLine();

        String[] words = inputText.split(" ");
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;
            }
        }

        System.out.println("Most frequently occurring word: " + mostFrequentWord);
    }
}
