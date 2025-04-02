
public class NumberToWords {

    // Arrays to store word representations
    private static final String[] ONES = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] TEENS = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TENS = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String numberToWords(int n) {
        // Step 1: Handle zero case
        if (n == 0) {
            return "zero";
        }

        // Step 2: Create an empty result using StringBuilder
        StringBuilder words = new StringBuilder();

        // Step 3: Process thousands place
        if (n >= 1000) {
            words.append(ONES[n / 1000]).append(" thousand ");
            n %= 1000;  // Remove the processed part
        }

        // Step 4: Process hundreds place
        if (n >= 100) {
            words.append(ONES[n / 100]).append(" hundred ");
            n %= 100;
            if (n > 0) {
                words.append("and "); // Add "and" if there are more digits

                    }}

        // Step 5: Process numbers between 11-19
        if (n > 10 && n < 20) {
            words.append(TEENS[n - 10]).append(" ");
        } else {
            // Step 6: Process tens place
            if (n >= 10) {
                words.append(TENS[n / 10]).append(" ");
                n %= 10;
            }
            // Step 7: Process ones place
            if (n > 0) {
                words.append(ONES[n]).append(" ");
            }
        }

        // Step 8: Trim and return the final string
        return words.toString().trim();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(numberToWords(7824));  // Output: "seven thousand eight hundred and twenty four"
        System.out.println(numberToWords(370));   // Output: "three hundred and seventy"
    }
}
          

