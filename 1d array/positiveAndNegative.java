public class positiveAndNegative {
          
          public static void positiveOrNegative(int n) {
                    if (n > 0) {
                  System.out.println(n + " is positive number");
              } else if (n < 0) {
                  System.out.println(n + " is negative number");
              } else {
                  System.out.println(n + " is zero");
              }

          }
          public static void main(String[] args) {
                    int n = 0;
                    positiveOrNegative(n);
          }
}
