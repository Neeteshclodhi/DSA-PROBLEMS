

public class LCM {
          
          public static void main(String[] args) {
                    int num1 = 4;
                    int num2 = 8;
                    int gcd = 1;
                    int lcm = 1;
                    int min = (num1 > num2) ? num1 : num2;
                    for (int i = 1; i <= min; i++) {
                              if (num1 % i == 0 && num2 % i == 0) {
                                        gcd = i;
                              }
                             
                    }
                    lcm = (num1 * num2) / gcd;
                    System.out.println("LCM of two numbers is : " + lcm);
          }
            
}
