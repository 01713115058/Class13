import java.util.LinkedHashMap;

public class Practice1 {
    public static void main(String[] args) {
        // Creation 
        LinkedHashMap<Integer, String> www = new LinkedHashMap<>();
        
        // Using unique keys for each fruit
        www.put(1, "Apple");
        www.put(2, "Orange");
        www.put(3, "Grape");
        www.put(4, "Banana");
        
        // Print the original map
        System.out.println("Original map: " + www);
        
        // Cloning the map
        LinkedHashMap<Integer, String> clonedMap = (LinkedHashMap<Integer, String>) www.clone();
        
        // Print the cloned map
        System.out.println("Cloned map: " + clonedMap);
    }
}
