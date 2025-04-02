

public class PalindromeRange {
        
          public static boolean isPalindrome(int n) {
                    int revNum = 0;
                    int temp = n;
                    while (temp > 0) {
                              int LastDigit = temp % 10;
                              revNum = (revNum * 10) + LastDigit;
                              temp = temp / 10;

                    }
                    if (revNum == n) {
                              return true;
                    } else {
                              return false;
                    }
          }
               public static void main(String args[]){
                         int min = 123;
                         int max = 453;

                         for (int i = min; i <=max; i++) {
                                   if (isPalindrome(i)) {
                                             System.out.println(i + " ");
                              }
                         }

               }

          }

