
public class linkList {
      
         
          
          public static class Node {
                    int data; // The data part of the node
                    Node next; // A reference (pointer) to the next node in the list

                    public Node(int data) {
                              this.data = data; // Assigns the data passed to the constructor
                              this.next = null; // Initially, the next pointer is null (i.e., this node does not link to
                                                // any other node)
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
          
          public void addLast(int data) { //O(1)
                    //step1-create newNode
                    Node newNode = new Node(data);
                    size++;

                    if (head == null) {

                              head = tail = newNode;
                              return;
                    }
                    //step2-
                    tail.next = newNode;

                    //step3-
                    tail = newNode;
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

          
          public void addMiddle(int idx, int data) {

                    if (idx == 0) {
                              addFirst(data);
                              return;
                    }
                    Node newNode = new Node(data);
                    size++;
                    Node temp = head;

                    int i = 0;
                      while (i < idx - 1) {
                              temp = temp.next;
                              i++;
                    }
                    //i = idx-1: temp -> prev
                    newNode.next = temp.next;
                    temp.next = newNode;
          }

          public int remFirst() {
                    if (size == 0) {
                              System.out.println("ll is empty");
                              return Integer.MIN_VALUE; //This is minus infinity
                    } else if (size == 1) {
                              int val = head.data;
                              head = tail = null;
                              size = 0;
                              return val;
                    }
                    int val = head.data;
                    head = head.next;
                    size--;
                    return val;

          }

          public int removeLast() {
                    if (size == 0) {
                              System.out.println("ll is empty");
                              return Integer.MIN_VALUE;
                    } else if (size == 1) {
                              int val = head.data;
                              head = tail = null;
                              size = 0;
                              return val;
                    }
                    //prev : i = size-2
                    Node prev = head;
                    for (int i = 0; i < size - 2; i++) {
                              prev = prev.next;

                    }

                    int val = prev.next.data;
                    prev.next = null;
                    tail = prev;
                    size--;
                    return val;
          }

          public int iterativeSearch(int key) {
                    int i = 0;
                    Node temp = head;
                    while (temp != null) {
                              if (temp.data == key) { //key found
                                        return i;
                              }
                              temp = temp.next;
                              i++;
                    }

                    //key not found
                    return -1;
          }

          public int helper(Node data, int key) {//O(n)
                    if (head == null) {
                              return -1;
                    }
                    if (head.data == key) {
                              return 0;
                    }
                    int idx = helper(head.next, key);
                    if (idx == -1) {
                              return -1;
                    }
                    return idx + 1;
          }

          public int recursiveSearch(int key) {
                    return helper(head, key);
          }

          public void reverse() {
                    Node prev = null;
                    Node curr = tail = head;
                    Node next;

                    while (curr != null) {
                              next = curr.next;
                              curr.next = prev;
                              prev = curr;
                              curr = next;
                    }

          }// Node is likely a class that represents the nodes of a linked list
          
          public void deleteNthFromEnd(int n) {
                    // Step 1: Calculate the size of the linked list (sz)
                    int sz = 0;
                    Node temp = head;

                    // Traverse through the linked list to calculate its length
                    while (temp != null) {
                              temp = temp.next; // Move to the next node
                              sz++; // Increment size for each node
                    }

                    // Step 2: Check if the node to be deleted is the head (i.e., n == sz)
                    if (n == sz) {
                              // If the nth node from the end is the head, remove the head by pointing to the
                              // next node
                              head = head.next; // This is equivalent to removing the first node
                              return; // Exit the function as the node has been deleted
                    }

                    // Step 3: Identify the position of the node to be deleted from the start
                    // We need to find the (sz - n)th node from the beginning to get the previous
                    // node of the target
                    int i = 1; // Index to traverse through the list
                    int idxToFind = sz - n; // Position of the node to be deleted from the start of the list
                    Node prev = head; // Initialize prev to point to the head

                    // Traverse the list until you reach the node just before the one you want to
                    // delete
                    while (i < idxToFind) {
                              prev = prev.next; // Move to the next node
                              i++; // Increment the index
                    }

                    // Step 4: Delete the target node by adjusting the 'next' pointer of the
                    // previous node
                    prev.next = prev.next.next; // Skip the node to be deleted by pointing to the node after it

                    return; // Return as the deletion is complete
          }
           
                    
          //slow-fast - approach
          public Node findMid(Node head) {
                    Node slow = head;
                    Node fast = head;
                    while (fast != null && fast.next != null) {
                              slow = slow.next;//+1
                              fast = fast.next.next; //+2
                    }
                    return slow; //slow is my middle
          }

          public boolean checkPalindrome() {
                    if (head == null || head.next == null) {
                              return true;
                    }
                    //step1 - find mid
                    Node midNode = findMid(head);

                    //step2 - reverse 2nd half
                    Node prev = null;
                    Node curr = midNode;
                    Node next;
                    while (curr != null) {
                              next = curr.next;
                              curr.next = prev;
                              prev = curr;
                              curr = next;
                    }

                    Node right = prev; //right half head
                    Node left = head;
                    //step3 - check left half & right half
                    while (right != null) {
                              if (left.data != right.data) {
                                        return false;
                              }
                              left = left.next;
                              right = right.next;
                    }
                    return true;
          }
          public static void main(String[] args) {
                    linkList ll = new linkList();
                    // ll.head = new Node(1);
                    // ll.head.next = new Node(2);
                    // ll.print();
                    // ll.addFirst(2);
                    // ll.print();
                    // ll.addFirst(1);
                    // ll.print();
                    // ll.addLast(4);
                    // ll.print();
                    // ll.addLast(5);
                    // ll.print();
                    // ll.addMiddle(2,3);
                    // ll.print();
                    // System.out.println(ll.size);
                    // ll.remFirst();
                    // ll.print();
                    // System.out.println(ll.size);

                    // ll.removeLast();
                   // ll.print();
                    // System.out.println(ll.size);
                    // System.out.println(ll.iterativeSearch(3));
                    // System.out.println(ll.iterativeSearch(10));
                    // System.out.println(ll.recursiveSearch(1));
                    // ll.deleteNthFromEnd(3);
                    // ll.print();
                    ll.addLast(6);
                    ll.addLast(4);
                    ll.addLast(2);
                    ll.addLast(1);
                    ll.print();
                    System.out.println(ll.checkPalindrome());

          }
          }

