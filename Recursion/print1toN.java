

// package Recursion;


public class print1toN {

          public static void print1toN(int n) {
                    if (n == 10) {
                              System.out.println(n);
                              return;
                    }
                    System.out.print(n + " ");
                    print1toN(n + 1);
                    
          }
        public static void main(String[] args) {
                  int n = 1;
                  print1toN(n);
        }  
}
