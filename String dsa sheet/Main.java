

//question 1 - use in place of e is i
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String result = "";

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e') {
                result += "i";  // Corrected: Use double quotes for proper concatenation
            } else {
                result += name.charAt(i);
            }
        }
        System.out.println(result);
        sc.close(); // Close scanner to avoid memory leak
    }
}
