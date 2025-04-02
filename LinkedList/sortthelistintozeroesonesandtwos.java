public class sortthelistintozeroesonesandtwos {

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

          public void sortList(Node head) {
                    //step1-count the occurences of 0's ,1's,2's
                    int count0 = 0, count1 = 0, count2 = 0;
                    Node curr = head;

                    while (curr != null) {
                              if (curr.data == 0) {
                                        count0++;
                              } else if (curr.data == 1) {
                                        count1++;
                              } else if (curr.data == 2) {
                                        count2++;
                              }
                              curr = curr.next;
                    //fill with 2s
                    while (count2 > 0) {
                              curr.data = 2;
                              curr = curr.next;
                              count2--;
                    }
          }
          //utility function to print the linkedlist
          
                    //step2:refill the list with 0s ,then 1s then 2s

                    curr = head;

                    //fill with 0s
                    while (count0 > 0) {
                              curr.data = 0;
                              curr = curr.next;
                              count0--;
                    }

                    //fill with 1s
                    while (count1 > 0) {
                              curr.data = 1;
                              curr = curr.next;
                              count1--;
                    }
                    }

                    public void printList(Node head){
                    Node temp = head;
                    while (temp != null) {
                              System.out.println(temp.data + "->");
                              temp = temp.next;

                    }
                    System.out.println("null");
          }


          //main function to test the sortlist function

          public static void main(String[] args) {
               
                    sortthelistintozeroesonesandtwos list = new sortthelistintozeroesonesandtwos();
                    Node head = new Node(2);
                    head.next = new Node(1);
                    head.next.next = new Node(0);
                    head.next.next.next = new Node(2);
                    head.next.next.next.next = new Node(1);
                    head.next.next.next.next.next = new Node(0);

                    System.out.println("origial list");
                    list.printList(head);

                    //sorting the list of 0s 1s and 2s
                    System.out.println("sorting the list...");
                    list.sortList(head);

                    System.out.println("sorted list...");
                    list.printList(head);
          }
}
