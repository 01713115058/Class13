import java.util.HashMap;
public class Practice {
    public static void main(String[] args) {
         HashMap<String, Integer> greade = new HashMap<>();
         // Creating a HashMap to store String keys and Integer values

          greade.put("Adnan", 45);
          greade.put("Shamim", 35);
          greade.put("Kamrul", 46);
          greade.put("Jamrul", 46);
          greade.put("Rohan", 20);

          //print  
          greade.get("shamim");
          System.err.println("get Shamim: "+greade);
          //get
          System.out.println("Get value for 'Kamal': " + greade.get("Kamal"));
          // Replace value for a key 
          greade.replace("Rohan", 100);
          System.out.println("After replacing value for 'Rohim': " + greade);

          for (HashMap.Entry<String, Integer> data : greade.entrySet()) {
            System.out.println(data.getKey() + " " + data.getValue());

    }
    }
}
