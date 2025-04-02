import java.util.*;
//is sabal ka logic bahut jagah use hota hai
public class nextGreaterElement {

          public static void main(String[] args) { //left greater on right side,if question wants to find nxt greater on left side we semply the change the direction of this loop
                    int arr[] = { 6, 8, 0, 1, 3 };
                    Stack<Integer> s = new Stack<>();

                    int nxtGreater[] = new int[arr.length];

                    for (int i = arr.length - 1; i >= 0; i--) {
                              //1 while
                              while (!s.isEmpty() && arr[s.peek()] <= arr[i]) { //smaller bole question agar nikalne ko to hum,< iska sign > esa kar denge 
                                        s.pop();
                              }

                              //2 if-else
                              if (s.isEmpty()) {
                                        nxtGreater[i] = -1;
                              } else {
                                        nxtGreater[i] = arr[s.peek()];
                              }

                              //3 push in s
                              s.push(i);
                    }
                    for (int i = 0; i < nxtGreater.length; i++) {
                              System.out.print(nxtGreater[i] + " ");
                    }
                    System.out.println();

          }
}
//this question has four forms
//1 next greater on right
// 2 next greater on left
// 3 next smaller on right
// 4 next smaller on left ,dono condition change kardenge ,loop ulta kardenge starting se and sign change kardenge < is ki jagah >