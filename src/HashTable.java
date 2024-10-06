import java.util.Hashtable;
import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ss = new Hashtable<>();
        //data insert
        ss.put(1, "Apple");
        ss.put(2, "Orange");
        ss.put(3, "Grape");
        ss.put(null,null);
        System.out.println(ss);

        //anather obj
        HashMap<String,Integer> vv = new HashMap<>();
        vv.put("Apple",1);
        vv.putAll(vv);
        System.out.println(vv);
    }

}
