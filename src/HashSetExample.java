import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();

        obj.add("Apple");
        obj.add("Orenge");
        obj.add("Lemon");
        obj.add("banana");
        obj.add("Mangoe");
        obj.add("Jacl fruit");
   
        System.err.println(obj);
   
        //remove data
        obj.remove("Mango");
        //data retrive ofter remove
        System.out.println("data retrive ofter remove ="+obj);
        System.err.println("set size ="+obj.size());
        System.err.println("contains method "+obj.contains("lemon"));
        //clear data
        obj.clear();
        System.err.println("data after clear set "+obj);
        System.err.println("use is Empty method = "+obj.isEmpty());
   
        //use Iterator
   
   Iterator<String> it = obj.iterator();
   //for(int i=0;i<5;i++)
   int i = 0;
   while (i<5){
        System.err.println(i);
        i++;
   }
   for (String st:obj){
        System.err.println(st);
   }
   for(int j=0;j<5;j++);
   }
    }



