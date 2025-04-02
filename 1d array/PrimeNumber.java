



public class PrimeNumber {
          //prime number has two(2) factors 1 and itself
         
          public static boolean primeNum(int n) {

                    int count = 0;
                       for (int i = 1; i <= n; i++) {
                              if (n % i == 0) {
                                        count = count + 1;
                              }
                           }
                              if (count == 2) {
                                        return true;
                              } else {
                                        return false;
                              }
 }
          public static void main(String[] args) {
                    int n = 9;
                   boolean isPrime = primeNum(n);
                    if (isPrime) {
                              System.out.println(n + " is a prime number.");
                    } else {
                              System.out.println(n + " is not a prime number.");
                    }
 }
}
























// public class PrimeNumber {
//           //prime number has two(2) factors 1 and itself
//           public static boolean primeNum(int n) { //0(sqrt(n))
//                     if (n <= 1) {
//                               return false;
//                     }
//                     for (int i = 2; i * i <= n; i++) {
//                               if (n % i == 0) {
//                                         return false;
//                               }
//                     }
//                     return true;
//           }
//           public static void main(String[] args) {
//                     int n = 17;
//                     System.out.println(primeNum(n));
//           }
// }
