
import java.util.*;

public class isPalindrome {
          
          


          public static boolean isPalindrome(String str) {
                    Stack<Character> s = new Stack<>();

                    // Push all characters onto the stack
                    for (int i = 0; i < str.length(); i++) {
                              char ch = str.charAt(i);
                              s.push(ch);
                    }

                    // Rebuild the string in reverse order using the stack
                    StringBuilder reverseStr = new StringBuilder();
                    while (!s.isEmpty()) {
                              reverseStr.append(s.pop());
                    }

                    // Compare the original string with the reversed string
                    return str.equals(reverseStr.toString());
          }

          public static void main(String[] args) {
                    String str = "racecar";
                    System.out.println(isPalindrome(str)); // Output: true
          }
}


