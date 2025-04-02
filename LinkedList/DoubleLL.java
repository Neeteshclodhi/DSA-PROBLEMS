public class DoubleLL {

          public class Node {
                    int data;
                    Node next;
                    Node prev;

                    public Node(int data) {
                              this.data = data;
                              this.next = null;
                              this.prev = null;
                    }
          }

          public static Node head;
          public static Node tail;
          public static int size;
      

          //addFirst
          public void addFirst(int data) {
                    Node newNode = new Node(data);
                    size++;
                    if (head == null) {

                              head = tail = newNode;
                              return;
                    }
                    newNode.next = head;
                    head.prev = newNode;
                    head = newNode;
          }

          public int remFirst() {
                    if (head == null) {
                              System.out.println("dll is empty");
                              return Integer.MIN_VALUE;
                    }

                    if (size == 1) {
                              int val = head.data;
                              head = tail = null;
                              size--;
                              return val;
                    }
                    int val = head.data;
                    head = head.next;
                    head.prev = null;
                    size--;
                    return val;

          }

          public void addLast(int data) {
                    Node newNode = new Node(data);
                    if (head == null) {
                              head = tail = newNode;
                              return;
                    }
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;

          }
          
          public void reverse() {
                    Node curr = head;
                    Node prev = null;
                    Node next;
                    
                    while (curr != null) {

                              next = curr.next;
                              curr.next = prev;
                              curr.prev = next;
                              prev = curr;
                              curr = next;
                    }
                    
                    head = prev;
          }

          public void printList() {
                    Node temp = head;
                    while (temp != null) {
                              System.out.println(temp.data + " <->");
                              temp = temp.next;
                    }
                    System.out.println("null");
          }
         //step1-create newNode
          //step2-newNode.next=head;

          //step2-head.prev=newNode
          //step4-head=newNode
          public static void main(String[] args) {
                    DoubleLL dll = new DoubleLL();
                    dll.addFirst(3);
                    dll.addFirst(2);
                    dll.addFirst(1);
                    dll.printList();
                    // System.out.println(dll.size);
                    // dll.remFirst();
                    // dll.printList();
                    // System.out.println(dll.size);
                    // dll.addLast(4);
                    // dll.printList();
                    dll.reverse();
                    dll.printList();



                    
          }
}
