
import java.util.Scanner;
public class PrintFibbonacciToNthTerm {
          
          public static void main(String[] args) {
                    int digit;
                    int a = 0;
                    int b = 1;
                    int c;
                    System.out.println("Enter your Digit");

                    Scanner sc = new Scanner(System.in);
                    digit = sc.nextInt();
                    sc.close();
                    for (int i = 1; i <= digit; i++) {
                              
                              System.out.println(a+ " ");
                              c = a + b;
                              a = b;
                              b = c;
                              
                         }
          }
}
