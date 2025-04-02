import java.util.*;

public class reivision {

    // Rename the Queue class to MyQueue to avoid conflicts with java.util.Queue
    class MyQueue {
        int[] arr;
        int size;
        int rear;

        // Constructor
        MyQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // Add an element to the queue
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Remove an element from the queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // Peek at the front of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Reivision class to access the inner MyQueue class
        reivision Revision = new reivision();
        MyQueue q = Revision.new MyQueue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        // Print and remove elements from the queue
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}









