import java.util.*;

public class Queue {
    public static void main(String[] args) {
        Queue<String> myq = new LinkedList<String>();

        myq.add("superman");
        myq.add("batman");
        myq.add("flash");

        System.out.println("My Elements are: " + myq);
        System.out.println("Remove " + myq.remove());
        System.out.println("My Elements are: " + myq);
        System.out.println("Remove " + myq.element());
        System.out.println("poll(): " + myq.poll());
        System.out.println("peek(): " + myq.peek());
        System.out.println("peek(): " + myq.peek());
        System.out.println("My Elements are: " + myq);
    }
}
