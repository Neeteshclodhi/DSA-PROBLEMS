

public class ArmStrongUsingRecursion {
          public static int arm(int n) {
                    if (n < 10) {
                              return n * n * n;
                    }
                    return (n % 10) * (n % 10) * (n % 10) + arm(n / 10);

          }
          public static void main(String[] args) {
                    int n = 15343;
                    int r ;
                    r= arm(n);
                    if (n == r) {
                              System.out.println("Number is Armstrong");
                    } else {
                              System.out.println("Number is not armstrong");
                    }
          }
}
