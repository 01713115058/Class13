import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        
        // Creating a PriorityQueue
        PriorityQueue<Integer> obj = new PriorityQueue<>();
        
        // Inserting elements
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        
        // Retrieve and print the elements
        System.out.println("PriorityQueue: " + obj);
        System.out.println("Removed element: " + obj.poll());

         // Retrieves and removes the head of the queue
        System.out.println("After poll: " + obj);

        System.out.println("Head of the queue: " + obj.peek());
         // Retrieves but does not remove the head

        
    }
}
