package Data_Structures.Queue;
import java.util.*;

//implementation using java in built queue

public class QueueI{
    public static void main(String args[]){

        Queue<Integer> q = new LinkedList<>();         // LinkedList-based queue
        //Queue<Integer> q = new ArrayDeque();        // Array-based queue
        //Queue<Integer> q = new PriorityQueue<>();  // Priority-based queue

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Queue elements: " + q);
    }
}


