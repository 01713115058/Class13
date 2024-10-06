import java.util.TreeMap;
public class JAvacallection {
    public static void main(String[] args) {
        TreeMap<Integer,String> rr = new TreeMap<>();
        rr.put(1,"rasni");
        rr.put(2,"oisi");
        rr.put(3,"maisa");
        rr.put(4,"payel");
        System.out.println(rr);

       TreeMap<String,Integer> rrr = new TreeMap<>();
        rrr.put("payel",1);
        rrr.put("oisi",2);
        rrr.put("maisa",3);
        rrr.put("payel",4);
        System.out.println(rrr);

        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i <4);

    }

}
