import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class mergeSortonLL {

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;

            }
            temp = temp.next;
        }

        //if elements left in head1
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        //if elements left in head2
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next; //skipping the temporary -1 node
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //left and right MS
        //split the list into two halves
        Node rightHead = mid.next;
        mid.next = null;

        //recursively sort both halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);

    }

    // Print function to display linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Manually creating the linked list
        mergeSortonLL ll = new mergeSortonLL();

        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("Original List:");
        ll.printList(head);

        // Applying merge sort on the linked list
        head = ll.mergeSort(head);

        System.out.println("Sorted List:");
        ll.printList(head);
    }

}

