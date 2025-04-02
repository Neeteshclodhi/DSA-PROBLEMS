package arrayList.stack.queqe;

import java.util.*;

public class queqe1 {
          static int arr[];
          static int size;
          static int rear = -1;

          queqe1(int size) {
                    arr = new int[n];
                    this.size = n;
          }
          
          public static boolean isEmpty() {
                    return rear == -1;
          }

          //enqueue-add
          public static void add(int data) {
                    if (rear == size - 1) {
                              System.out.println("full queue");
                              return;
                    }

                    rear++;
                    arr[rear] = data;
          }

          //dequeue-O(n)
          public static int remove() {
                    if (isEmpty()) {
                              System.out.println("empty queue");
                              return -1;
                    }

                    int front = arr[0];
                    for (int i = 0; i < rear; i++) {
                              arr[i] = arr[i + 1];
                    }
                    rear--;
                    return front;
          }
          
}
