public class removeConsecutiveCharacter {
         
          public static String removConsecutiveCharacter(String S) {
                    int n = S.length();
                    String res = "";
                    for (int i = 0; i < n; i++) {
                              if (i < n - 1 && S.charAt(i) == S.charAt(i + 1)) {
                                        continue;
                              }

                              else {
                                        res += S.charAt(i);
                              }

                    }

                    return res;
          }

          public static void main(String[] args) {
                    String s ="aabb";
         
                    System.out.println(removConsecutiveCharacter(s));
          }
}
