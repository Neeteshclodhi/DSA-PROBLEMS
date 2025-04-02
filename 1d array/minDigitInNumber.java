public class minDigitInNumber {
       
          public static int min(int n) {
                    int min = Integer.MAX_VALUE;
                    while (n > 0) {
                              int ld = n % 10;
                              if (min > ld) {
                                        min = ld;

                              }
                               n = n / 10;

                          }
                  return min;
          }
          public static void main(String[] args) {
                    int digit = 51243;
                    System.out.println(min(digit));
          }
}
