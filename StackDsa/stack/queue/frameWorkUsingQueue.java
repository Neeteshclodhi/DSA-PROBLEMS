// package queue;
import java.util.*;

public class frameWorkUsingQueue {
       
       //QUEUE is interface so we cannot make of objects of queue never   
    public static void main(String[] args) {
          //     Queue<Integer> q = new LinkedList<>();//ArrayDeque
              Queue<Integer> q = new ArrayDeque<>();
              q.add(1);
              q.add(2); //O(1)
              q.add(3);

              while (!q.isEmpty()) {
                    System.out.println(q.peek());
                    q.remove();
              }
;
    }
}
