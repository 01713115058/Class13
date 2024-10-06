import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListpractice {
    public static void main(String[] args) {
        ArrayList<Integer> R = new ArrayList<>();

        R.add(0);//index 0
        R.add(1);//index 1
        R.add(2);//index 2
        R.add(3);//index 3
        R.add(4);//index 4
        R.add(5);//index 5
        R.add(6);//index 6
        R.add(7);//index 7
        R.add(8);//index 8
        R.add(9);//index 9
       
        int target = R.get(3);
int w = binarysearch(R, target);

int target2 = 50;
int w2 = binarysearch(R, target2);

if (w== -1) {
    System.out.println("no element found");
    
}
else{
    System.out.println("value is = "+w);
}

if (w2== -1) {
    System.out.println("no element found");
    
}
else{
    System.out.println("value is = "+w2);
}
    
    
    }


    public static int binarysearch(ArrayList<Integer> q, int target1){
        int start = 0;
        int end = q.size()-1;
        while (start<=end) {
            int mid =(start+end)/2;
            if(target1>q.get(mid)){
                start=mid+1;
            }
            else if(target1<q.get(mid)) {
                end = mid-1;

            }
            else{
                return q.get(mid);
            }
            
        }
        return -1;

    }
        
       
}












        
    


