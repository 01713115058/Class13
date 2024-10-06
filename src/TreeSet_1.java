import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet_1 { 
    public static void main(String[] args) {
        //creator
        TreeSet<Integer> obj = new TreeSet<>();
        //insert data
        obj.add(20);
        obj.add(60);
        obj.add(30);
        obj.add(90);
        obj.add(100);
        System.err.println("Tree set ="+obj);
        System.err.println("Frist value ="+obj.first());
        System.err.println("last value ="+obj.last());
        System.err.println("Higher value in 10 ="+obj.higher(10));
        System.err.println("lower value in 10 ="+obj.lower(10));

        //use Iterstor
        Iterator<Integer> b = obj.iterator();
        while (b.hasNext()){
            System.err.println(b.next());
        }
       for(Integer a:obj){
        System.err.println(a);
       }
    }


}
