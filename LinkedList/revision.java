

import java.util.*;

public class revision {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { //O(1)

        // step1-create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //step2-newNode next=head
        newNode.next = head;
        //step3-head=newNode
        head = newNode;
    }

    public void print() {//O(n)
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void remDup(Node head) {
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

    

    public static void main(String[] args) {
        revision ll = new revision();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
         head.next.next.next = new Node(5);
          head.next.next.next.next = new Node(3);
           head.next.next.next.next.next = new Node(1);
        //  head.next.next.next = head;
        //  System.out.println(ll);
        // ll.print();
        // ll.delWith(head.next);
        //   ll.print();
        ll.print();
        ll.remDup(head);
        ll.print();

    }

}
