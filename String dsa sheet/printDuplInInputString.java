import java.util.*;

public class printDuplInInputString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If you want to allow spaces in input, use nextLine() instead of next()
        String s1 = sc.nextLine(); // Changed to nextLine() to handle full input with spaces if needed.

        // Array to store count of each character (for ASCII values)
        int[] count = new int[256];

        // Count occurrences of each character in the string
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }

        // Print characters with more than 1 occurrence (duplicates)
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) (i) + " count = " + count[i]);
            }
        }
    }
}
