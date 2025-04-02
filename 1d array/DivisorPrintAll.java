public class DivisorPrintAll {
   //very very important question
          public static void printAllDivisor(int n) { //0(n)-this is not good time compexity
                    
                    for (int i = 1; i <= n; i++) {
                              if ((n % i) == 0) {
                                        System.out.println(i);
                              }
                    }
          }
         
          public static void main(String[] args) {
                    int n = 21;
                    printAllDivisor(n);
          }
}
