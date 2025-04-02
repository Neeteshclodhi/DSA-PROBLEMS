
public class ArmStrongNum {

    public static boolean armstrongNum(int n) { //armstron numbers is that when combines  the sum of cube of numbers equals to the sum of the number
        int num = n;
        int sum = 0;

        int k = String.valueOf(n).length();

        while (n > 0) {
            int ld = n % 10;
            sum += Math.pow(ld, k);
            n = n / 10;

        }
//         return sum == num ? true : false;
        return sum == num;

    }

    public static void main(String[] args) {
        int n = 153; //1634,370,371,407
        boolean isArmstrongNum = armstrongNum(n);
        if (isArmstrongNum) {
            System.out.println(n + " is armstrong number");
        } else {
            System.out.println(n + " is not armstrong nmuber");
        }

    }
}



























//           public static boolean armstrongNum(int n) { //armstron numbers is that when combines  the sum of cube of numbers equals to the sum of the number
//                     int temp = n;
//                     int sum = 0;
//                     while (n > 0) {
//                               int lg = n % 10;
//                               sum = sum+(lg * lg * lg);
//                               n = n / 10;
//                     }
//                     if (temp == sum) {
//                               return true;
//                     } else {
//                               return false;
//                     }
//           }
//           public static void main(String[] args) {
//                     int n = 371;
//                     System.out.println(armstrongNum(n)); 
//           }
// }
