import java.util.*;
public class AlternateSignsSum {
            
          //1-2+3-4+5 = 3,odd number is plus ,and even number is minus
          //10 = 1-2+3-4+5-6+7-8+9-10=-5
          public static int printSum(int n) {
                    if (n == 0) {
                              return 0;
                    }
                    if (n % 2 == 0) {
                              return printSum(n - 1) - n;
                    } else {
                              return printSum(n - 1) + n; 
                    }
                    
          }
          public static void main(String[] args) {
                    // Scanner sc = new Scanner(System.in);
                    // int n = sc.nextInt();
                    System.out.println(printSum(5));
                    System.out.println(printSum(10));
          }
}
