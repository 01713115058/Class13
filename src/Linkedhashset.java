import java.util.LinkedHashSet;

public class Linkedhashset {

    public static void main(String[] args) {
        
        // Create a LinkedHashSet
        LinkedHashSet<Integer> obj = new LinkedHashSet<>();

        // Insert elements
        obj.add(1);
        obj.add(2);
        obj.add(10);
        obj.add(15);

        // Retrieve and print the elements
        System.out.println(obj);
    }
}
