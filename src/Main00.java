import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main00 {
    // Count the number of unique words in the text
    //Write a program that reads a text string from the keyboard and counts the number of unique
    // words in the text. Use a HashMap where the words will be the keys and the number of them
    // occurrences - values. Display the results on the screen.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fulltext = scanner.nextLine();
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();

        String[] words = fulltext.split(" ");

        for (String word : words){
            if (stringIntegerHashMap.containsKey(word)){
                stringIntegerHashMap.put(word, stringIntegerHashMap.get(word)+1);
            }else {
                stringIntegerHashMap.put(word,1);
            }
        }
        for (Map.Entry<String, Integer> entry : stringIntegerHashMap.entrySet()){
            System.out.println(entry.getKey()+ " | " + entry.getValue());
        }
    }
}
