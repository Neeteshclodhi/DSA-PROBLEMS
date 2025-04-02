public class FactorialOfNumber {
         
          //iterative approach,recursive approach
          public static void main(String[] args) {
                    int n = 5; //factorial is 5!=5*4*3*2*1=120
                    int fact = 1;
                    for (int i = 1; i <= n; i++) {

                              fact *= i;
                    }
                    System.out.println(fact);
          }
}
