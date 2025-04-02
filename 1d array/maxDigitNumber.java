public class maxDigitNumber {

          public static int maxNumber(int n) {
                    int max = Integer.MIN_VALUE;
                    while (n > 0) {
                              int ld = n % 10;
                              if (max < ld) {
                                        max = ld;
                              }
                              n = n / 10;
                    }
                    return max;
                              
                    
          }
         
          public static void main(String[] args) {
                    int n = 54213;
                    System.out.println(maxNumber(n));


          }
}
