import java.util.Arrays;
import java.util.Collections;
public class ArraySort {

    public static void main(String[] args) {
        //A Sarting array

        int [] a = {2,3,4,10,40,50};
        //Element to search
        int target = 2;
        //perform binary search


        int result = bainarySearch(arr,target);
         //Display result

         if(result == -1){

            System.out.println("Element not found in array");
         }
         else{
        

         }

        System.out.println(Arrays.toString(a));

        Arrays.sort(a,Collections.reverseOrder());
    }

}
