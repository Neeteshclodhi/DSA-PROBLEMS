public class validAnagram {
          public static boolean validAnagram(String s, String t) {
                    int m = s.length();
                    int n = t.length();
                    if (m != n) {
                              return false;
                    } else {
                              int count[] = new int[26];
                              for (int i = 0; i < m; i++) {
                                        count[s.charAt(i) - 'a']++;
                              }

                              for (int i = 0; i < n; i++) {
                                        count[t.charAt(i) - 'a']--;
                              }

                              for (int i = 0; i < count.length; i++) {
                                        if (count[i] != 0) {
                                                  return false;
                                        }
                                        
                                        
                              }
                              return true;
                    }
          }
          public static void main(String[] args) {
                    String s = "anagram";
                    String t = "nagaram";
                    System.out.println(validAnagram(s,t));

          }
}



// import java.util.Arrays;

// public class ValidAnagram {

//     public static boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }

//         // Convert to character arrays and sort them
//         char[] sArr = s.toCharArray();
//         char[] tArr = t.toCharArray();
//         Arrays.sort(sArr);
//         Arrays.sort(tArr);

//         // Compare sorted strings
//         return Arrays.equals(sArr, tArr);
//     }

//     public static void main(String[] args) {
//         String s = "anagram";
//         String t = "nagaram";
//         System.out.println(isAnagram(s, t)); // Output: true
//     }
// }
