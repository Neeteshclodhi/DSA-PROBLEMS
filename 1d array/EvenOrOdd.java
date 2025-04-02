
public class EvenOrOdd {

          public static int remainder(int n) {
                    return (n % 2);

          }

          public static void isOddEven(int n) {
                    
                    if (remainder(n) == 0) {
                              System.out.println(n + " is a even number");
                    } else {
                              System.out.println(n + " is a odd number");
                    }
          }
          public static void main(String[] args) {
                    int n = 31;
                    isOddEven(n);
                    

          }
}























// public class EvenOrOdd {
//           public static boolean oddEven(int n) {
//                     for (int i = 0; i <= n; i++) {
//                               if (n % 2 == 0)
//                                         return true;
//                     }
//                     return false;
//           }
//           public static void main(String[] args) {
//                     int n = 220;
//                     boolean isOddEven = oddEven(n);
//                     if (isOddEven) {
//                               System.out.println(n + " is even number");
//                     } else {
//                               System.out.println(n + " is a odd number");
//                     }
//           }
// }
