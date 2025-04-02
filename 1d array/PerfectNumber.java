

public class PerfectNumber {

          //A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.            
          //Example:     The number 6 is a perfect number because \(6=1+2+3\).

          public static boolean isPerfect(int n) {
                    int sum = 0;
                    int temp = n;
                    for (int i = 1; i < n; i++) {
                              if (n % i == 0) {
                                        sum += i;
                              }
                    }
                    return sum == temp;

          }

          public static void main(String[] args) {
                    int n = 8128; //6,28,496
                    boolean perfect = isPerfect(n);
                    if (perfect) {
                              System.out.println(n + " is perfect number");
                    } else {
                              System.out.println(n + " is not a perfect number");
                    }

          }
}

































//optimized approach

// public class PerfectNumber {

//     public static boolean isPerfect(int n) {
//         if (n <= 1) {
//             return false;  // Perfect numbers must be positive and greater than 1

//                 }
//            int sum = 1; // Start with 1 since 1 is always a divisor
//         int sqrt = (int) Math.sqrt(n);  // Only loop till square root of n

//         for (int i = 2; i <= sqrt; i++) {
//             if (n % i == 0) {  // If i is a divisor of n
//                 sum += i;
//                 if (i != n / i) {  // Avoid adding the square root twice if it's a perfect square
//                     sum += n / i;  // Add the paired divisor
//                 }
//             }
//         }

//         return sum == n;  // If sum of divisors equals the number, it's perfect
//     }

//     public static void main(String[] args) {
//         int n = 8128; // Example: 6, 28, 496
//         boolean perfect = isPerfect(n);
//         if (perfect) {
//             System.out.println(n + " is a perfect number");
//         } else {
//             System.out.println(n + " is not a perfect number");
//         }
//     }
// }
