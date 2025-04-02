public class multiplyTwoList {

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

          public long multiTwoLists(Node first, Node second) {
                    long MOD = 100000007;
                    long num1 = 0, num2 = 0;

                    //traverse the first list and construct the number with modulo
                    while (first != null || second != null) {
                              if (first != null) {
                                        num1 = ((num1 * 10) + first.data) % MOD;
                                        first = first.next;
                              }
                              //traverse the second list and construct the number with modulo
                              if (second != null) {
                                        num2 = ((num2 * 10) + second.data) % MOD;
                                        second = second.next;
                              }
                    }
                    //returns the product of the two ,numbers with modulo
                    return (num1 * num2) % MOD;
          }

          public void printList(Node head) {
                    Node temp = head;
                    while (temp != null) {
                              System.out.println(temp.next + "->");
                              temp = temp.next;
                    }
                    System.out.println();
          }

          public void main(String args[]) {

                    // create first list 9->4->6
                    Node head1 = new Node(9);
                    head1.next = new Node(4);
                    head1.next.next = new Node(6);

                    // create second list 8->4
                    Node head2 = new Node(8);
                    head2.next = new Node(4);
                    System.out.println(multiTwoLists(head1, head2));
          }
}

