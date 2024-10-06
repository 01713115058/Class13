import java.util.HashMap;
import java.util.Map;
public class HasMapexample {
    public static void main(String[] args) {
        // Creating a HashMap to store String keys and Integer values
        Map<String, Integer> obj = new HashMap<>();
        // Data insertion
        obj.put("Rakibul", 40);
        obj.put("Abdullah", 45);
        obj.put("Shamim", 35);
        obj.put("Kamal", 46);
        obj.put("Jamal", 46);
        obj.put("Rohim", 20);
        obj.put(null, null); // This is allowed, but use with caution
        // Print the map
        System.out.println("Initial map: " + obj);
        // Remove a key-value pair

        obj.remove("Kamal");
        System.out.println("After removal: " + obj);
        // Attempt to get value with a different case

        System.out.println("Get value for 'Kamal': " + obj.get("Kamal")); 
        // returns null since the key was removed
        // Replace value for a key

        obj.replace("Rohim", 100);
        System.out.println("After replacing value for 'Rohim': " + obj);
        // Get values using a for-each loop
        
        for (Map.Entry<String, Integer> data : obj.entrySet()) {
            System.out.println(data.getKey() + " " + data.getValue());
        }
    }
}