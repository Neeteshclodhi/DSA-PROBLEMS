public class keypadnumericValuesPrint {

          // Method to convert the input string to corresponding keypad sequence
          static String printSequence(String S) {
                    // Array that stores sequences corresponding to each letter A-Z
                    String[] arr = {
                                        "2", "22", "222", // A, B, C
                                        "3", "33", "333", // D, E, F
                                        "4", "44", "444", // G, H, I
                                        "5", "55", "555", // J, K, L
                                        "6", "66", "666", // M, N, O
                                        "7", "77", "777", "7777", // P, Q, R, S
                                        "8", "88", "888", // T, U, V
                                        "9", "99", "999", "9999" // W, X, Y, Z
                    };

                    // Initialize an empty string to store the final result
                    S = S.toUpperCase();
                    String res = "";

                    // Loop through each character in the input string
                    for (int i = 0; i < S.length(); i++) {
                              // Check if the character is a space, which corresponds to '0' on the keypad
                              if (S.charAt(i) == ' ') {
                                        res += "0"; // Add '0' to the result for spaces
                              } else {
                                        // Convert the character to uppercase (if not already), then find the
                                        // corresponding index
                                        // 'A' has an ASCII value of 65, so subtracting 'A' gives the index
                                        int idx = S.charAt(i) - 'A';

                                        // Append the corresponding numeric sequence from the array to the result
                                        res += arr[idx];
                              }
                    }
                    return res; // Return the final numeric sequence
          }

          public static void main(String[] args) {
                    // Test input string
                    String input = "ram RAM";

                    // Call the method and print the result
                    System.out.println(printSequence(input));
          }
}
