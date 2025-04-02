public class RemoveAllVowels {

          public static void RemoveVowels(String s, int n) {
                    s = s.toLowerCase();
                    for (int i = 0; i < n; i++) {
                              char ch = s.charAt(i);
                              if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u') {
                                        continue;
                              }
                            
                              System.out.print(ch);
                    }
                    System.out.println();
          }
      
          public static void main(String[] args) {
                    String str = "Neetesh";
                    int n = str.length();
                    RemoveVowels(str, n);
          }
}
