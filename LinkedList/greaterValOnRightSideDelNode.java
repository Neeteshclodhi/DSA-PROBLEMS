import java.util.*;

public class greaterValOnRightSideDelNode {

          public static class Node {
                    int data;
                    Node next;

                    public Node(int data) {
                              this.data = data;
                              this.next = null;
                    }
          }

          public static Node head;
          public static Node tail;

          public Node rev(Node head) {
                    Node curr = head;
                    Node prev = null;
                    Node next;
                    while (curr != null) {
                              next = curr.next;
                              curr.next = prev;
                              prev = curr;
                              curr = next;
                    }
                    return prev;
          }

          public Node delValonRightside(Node head) {
                    head = rev(head);
                    Node curr = head;

                    while (curr != null && curr.next != null) {
                              if (curr.data > curr.next.data) {
                                        curr.next = curr.next.next;
                              } else
                                        curr = curr.next;

                    }
                    return rev(head);

          }

          public void printList(Node head) {
                    Node temp = head;
                    while (temp != null) {
                              System.out.print(temp.data + " ");
                              temp = temp.next;
                    }
                    System.out.println();
          }

          public static void main(String[] args) {
                    greaterValOnRightSideDelNode list = new greaterValOnRightSideDelNode();

                    // Create nodes with values 12, 15, 10, 11, 5, 6, 2, 3
                    list.head = new Node(12);
                    list.head.next = new Node(15);
                    list.head.next.next = new Node(10);
                    list.head.next.next.next = new Node(11);
                    list.head.next.next.next.next = new Node(5);
                    list.head.next.next.next.next.next = new Node(6);
                    list.head.next.next.next.next.next.next = new Node(2);
                    list.head.next.next.next.next.next.next.next = new Node(3);

                    System.out.println("Original List:");
                    list.printList(list.head); // Print the original list

                    System.out.println("List after deletion of nodes with greater values on the right:");
                    list.head = list.delValonRightside(list.head); // Modify the list and print the result
                    list.printList(list.head);
          }
}

