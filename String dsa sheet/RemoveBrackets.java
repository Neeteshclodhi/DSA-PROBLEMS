public class RemoveBrackets {

          public static String remBrackets(String str ,int n) {
                    StringBuffer ans = new StringBuffer();
                    for (int i = 0; i < n; i++) {
                              if ( str.charAt(i) != '(' && str.charAt(i) !=')' ) {
                                        ans.append(str.charAt(i));
                              }
                    }
                    return ans.toString(); 
          }
       
          public static void main(String[] args) {
                    String str = "(lodhi(neetesh)())";
                    int n = str.length();
                    System.out.println(remBrackets(str, n));
          }
}
