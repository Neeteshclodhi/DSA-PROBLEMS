public class getIntersectionPoint {

          //the problem can be easily solved using 2 nestedd for loops.the outer loop will be for each node of the 1st list and the inner loop will be for each node of the 2nd list,
          //in the inner loop ,check if any of the nodes of the 2nd list is the same as the current node of the first linked list,the first node which is same as the current nodeof the first linked list,
          //the first node which is same as the current  node is the intersection point.                                        
          public static class Node {
                    int data;
                    Node next;

                    public Node(int data) {
                              this.data = data;
                              this.next = null;
                    }
          }
//we can solve this problem from the hashset also.
          public static Node head;
          public static Node tail;

          public static Node getIntersectionNode(Node head1, Node head2) {

                    while (head2 != null) {
                              Node temp = head1;
                              while (temp != null) {
                                        //if both nodes are same
                                        if (temp == head2) {
                                                  return head2;
                                        }
                                        temp = temp.next;
                              }
                              head2 = head2.next;
                    }
                    //if intersection is not present between the lists
                    //return null
                    return null;
          }

          public static void main(String[] args) {

                    // Create two linked lists
                    // 1st List: 3 -> 6 -> 9 -> 15 -> 30
                    // 2nd List: 10 -> 15 -> 30
                    // 15 is the intersection point

                    // creation of first list
                    Node head1 = new Node(10);
                    head1.next = new Node(15);
                    head1.next.next = new Node(30);

                    // creation of second list
                    Node head2 = new Node(3);
                    head2.next = new Node(6);
                    head2.next.next = new Node(9);
                    head2.next.next.next = head1.next;

                    Node getIntersectionPoint = getIntersectionNode(head1, head2);

                    if (getIntersectionPoint == null)
                              System.out.print(" No Intersection Point \n");
                    else
                              System.out.print("Intersection Point: "
                                                  + getIntersectionPoint.data);
          }
}
//2nd approach to solve this problem by hashset

// Java program to get intersection point of two linked
// list using hashing

// import java.util.HashSet;

// class Node {
//           int data;
//           Node next;

//           Node(int new_data) {
//                     data = new_data;
//                     next = null;
//           }
// }

// Function to get the intersection point of two linked
// lists
// class GfG {
//           static Node getIntersectionNode(Node head1, Node head2) {
//                     HashSet<Node> visitedNodes = new HashSet<>();

//                     // Traverse the first list and store all nodes
//                     // in a set
//                     Node curr1 = head1;
//                     while (curr1 != null) {
//                               visitedNodes.add(curr1);
//                               curr1 = curr1.next;
//                     }

//                     // Traverse the second list and check if any node is
//                     // in the set
//                     Node curr2 = head2;
//                     while (curr2 != null) {
//                               if (visitedNodes.contains(curr2)) {

//                                         // Intersection point found
//                                         return curr2;
//                               }
//                               curr2 = curr2.next;
//                     }

//                     return null;
//           }

//           public static void main(String[] args) {

//                     // Create two linked lists
//                     // 1st List: 3 -> 6 -> 9 -> 15 -> 30
//                     // 2nd List: 10 -> 15 -> 30
//                     // 15 is the intersection point

//                     // creation of first list
//                     Node head1 = new Node(10);
//                     head1.next = new Node(15);
//                     head1.next.next = new Node(30);

//                     // creation of second list
//                     Node head2 = new Node(3);
//                     head2.next = new Node(6);
//                     head2.next.next = new Node(9);
//                     head2.next.next.next = head1.next;

//                     Node intersectionPoint = getIntersectionNode(head1, head2);

//                     if (intersectionPoint == null)
//                               System.out.print(" No Intersection Point \n");
//                     else
//                               System.out.print("Intersection Point: "
//                                                   + intersectionPoint.data);
//           }
// }
          

