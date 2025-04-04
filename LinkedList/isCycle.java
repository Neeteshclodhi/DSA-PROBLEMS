public class isCycle {

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
          public static int size;

          public static boolean detectCycle() { //floyd's cycle finding algorithm
              // Check if the list is empty or contains only one element
              if (head == null || head.next == null) {
                  return false;
              }
                    Node slow = head;
                    Node fast = head.next;

                    while (fast != null && fast.next != null) {
                              slow = slow.next;
                              fast = fast.next.next;
                              if (slow == fast) {
                                        return true;
                              }
                    }
                    return false;

          }

          public static void main(String[] args) {
                    head = new Node(1);
                    head.next = new Node(2);
                    head.next.next = new Node(3);
                    head.next.next.next = head;
                    //1->2->3->1
                    System.out.println(detectCycle());
    }
          
}
