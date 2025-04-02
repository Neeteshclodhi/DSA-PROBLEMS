


public class RemoveSpacesFromString {
          public static void main(String[] args) {
                    String str = "neetesh lodhi semester six";
                    for (int i = 0; i < str.length(); i++) {
                              char ch = str.charAt(i);
                              if (ch == ' ') {
                                        continue;
                              }
                              System.out.print(ch);
                    }
                    System.out.println();
                   
          }
         
}
