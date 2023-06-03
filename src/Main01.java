import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main01 {
    // Union of two HashMap
    //Create two HashMap with elements. Then combine them into one HashMap. If there are identical
    // keys, select value from first HashMap. Print the resulting HashMap to the screen.

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap0 = new HashMap<>();

        hashMap0.put("Real Madrid",30);
        hashMap0.put("Barcelona",1);
        hashMap0.put("Arsenal",15);
        hashMap0.put("Manchester City",28);

        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Arsenal",28);
        hashMap1.put("Dinamo",2);
        hashMap1.put("Manchester City",28);
        hashMap1.put("Barcelona",2);

        HashMap<String, Integer> hashMap2 = new HashMap<>();
        for (Map.Entry<String,Integer> entry : hashMap1.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            hashMap2.putIfAbsent(key,value);
        }
        System.out.println("Merged HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap2.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
