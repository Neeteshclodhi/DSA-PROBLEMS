public class isPalindrome {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));

           }
      }





          // public static boolean checkPalindrome(String str) {
          //           for (int i = 0; i < str.length() / 2; i++) {
          //                     int n = str.length();
          //                     if (str.charAt(i) != str.charAt(n - 1 - i)) {
          //                               return false;

          //                     }
          //           }
          //           return true;
          // }
          // public static void main(String[] args) {
          //           String str = "racecar";
          //           System.out.println(checkPalindrome(str));
          // }

          //2nd way to solve this problem
//       public static boolean checkPalindrome(String s) {
//           s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
//           int i = 0;
//           int j = s.length()-1;
//           while(i<=j){
//                     if(s.charAt(i)!=s.charAt(j)){
//                               return false;
//           }
//           i++;
//           j--;

// }
// return true ; 
//       }

//       public static void main(String[] args) {
//                 String s = "racecar";
//                 System.out.println(checkPalindrome(s));
//       }
// }


// public static boolean isPalindrome(String s) {
//     int left = 0, right = s.length() - 1;
//     while (left < right) {
//         if (s.charAt(left) != s.charAt(right)) return false;
//         left++;
//         right--;
//     }
//     return true;
// }
