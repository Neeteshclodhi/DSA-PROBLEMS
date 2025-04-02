public class CountVowelsConsonentsAndWhiteSpaces {
          public static void isSolve(String str,int n) {
                     str = str.toLowerCase();
                    int vowelCount = 0;
                    int whiteSpaceCount = 0;
                    int consonentCount = 0;
                    for (int i = 0; i < n; i++) {
                              char ch = str.charAt(i);
                              if (ch == 'a' || ch == 'i' || ch == 'o'
                                                  || ch == 'e' || ch == 'u') {
                                        vowelCount++;

                              } else if (ch >= 'a' && ch <= 'z') {
                                        consonentCount++;
                              } else if (ch == ' ') {
                                        whiteSpaceCount++;
                              }

                    }
                    System.out.println( "Vowels count is : " + vowelCount );
                    System.out.println("Consonent count is : " + consonentCount);
                    System.out.println("White spaces count is : " + whiteSpaceCount );
          }
         
          
                    
          
          public static void main(String args[]) {
                    String str = "Neetesh lodhi";
                    int n = str.length();
                    isSolve(str, n);

          }
}
