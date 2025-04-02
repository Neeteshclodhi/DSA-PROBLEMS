public class delNodeWithoutHeadPointer {

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

          public void deleteNode(Node node) {
                    if ((node == null && node.next == null)) {
                              return ;

                    }

                    node.data = node.next.data;
                    node.next = node.next.next;
          }

          public void printList(Node head){
                    Node temp = head;
                    while(temp!=null){

                              System.out.println(temp.data + "-> ");
                              temp = temp.next;

                    }  
                    System.out.println("null");        
          }

          public static void main(String[] args){
                    delNodeWithoutHeadPointer list = new delNodeWithoutHeadPointer();
                    Node head = new Node(10);
                    head.next = new Node(20);
                    head.next.next = new Node(30);
                    head.next.next.next = new Node(40);


        System.out.println("Original List:");
        list.printList(head);

         
        // Deleting node with value 30
        System.out.println("Deleting node 30...");
        list.deleteNode(head.next.next);  // Pass node 30 for deletion

        System.out.println("Updated List:");
        list.printList(head);
    }

          }


