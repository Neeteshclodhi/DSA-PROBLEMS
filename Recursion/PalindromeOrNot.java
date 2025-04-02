public class PalindromeOrNot {
         
          public static int palindrome(int n,int sum) {
                    if (n == 0) {
                              return sum;
                    }
                    sum = (sum * 10) + (n % 10);
                    return palindrome(n / 10, sum);
          }
          public static void main(String[] args) {
                    int n = 121;
                    int sum = 0;
                    int p;
                    p = palindrome(n, sum);
                    if (p == n) {
                              System.out.println("Number is Palindrome");
                    } else {
                              System.out.println("Number is not palindrome");
                     }
          }
}
