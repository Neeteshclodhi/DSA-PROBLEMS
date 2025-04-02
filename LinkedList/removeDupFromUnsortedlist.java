import java.util.*;

public class removeDupFromUnsortedlist {
          
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

          public void removeDuplicates(Node head) {
                    HashSet<Integer> seen = new HashSet<>();

                    Node curr = head;
                    Node prev = null;

                    while (curr != null) {
                              if (seen.contains(curr.data)) {
                                        prev.next = curr.next;

                              } else if (seen.add(curr.data)) {
                                        prev = curr;
                              }
                              curr = curr.next;
                    }

          }
          
          public void printList(Node head) {
                    Node temp = head;
                    while (temp != null) {
                              System.out.println(temp.data + "->");
                              temp = temp.next;
                    }
                    System.out.println("null");
          }

          public static void main(String[] args) {
                    removeDupFromUnsortedlist list = new removeDupFromUnsortedlist();

        // Creating a linked list: 10 -> 12 -> 11 -> 11 -> 12 -> 11 -> 10 -> null
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(11);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(10);

        list.printList(head);
        list.removeDuplicates(head);
        list.printList(head);

        
    }
}

