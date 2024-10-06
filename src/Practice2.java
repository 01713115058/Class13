import java.util. LinkedHashMap;
import java.util.HashMap;
public class Practice2 {
    public static void main(String[] args) {
          // Creation 
          LinkedHashMap<Integer, String> hello = new LinkedHashMap<>();
          // Using unique keys for each fruit
         hello.put(1, "Apple");
         hello.put(2, "Orange");
         hello.put(3, "Grape");
         hello.put(4, "Banana");
         System.out.println(hello);

         for (HashMap.Entry< Integer,String> data :hello.entrySet()) {
            System.out.println(data.getKey());
    }
    for (HashMap.Entry< Integer,String> data :hello.entrySet()) {
      
        System.out.println(data.getValue());
}
    for(Integer key:hello.keySet()){
        System.out.println(key);
    }
    for(String value:hello.values()){
        System.out.println(value);
    }
    }
}
