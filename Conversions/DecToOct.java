
public class DecToOct {

    public static void DecToOctal(int dec) {
        int n = dec;
        int mod;
        int octal = 0;
        int placeValue = 1; // Represents 10^0, 10^1, 10^2...

        while (n > 0) {
            mod = n % 8;  // Get remainder when divided by 8
            octal = octal + (mod * placeValue); // Build the octal number
            placeValue *= 10; // Move to the next place value
            n = n / 8; // Reduce the number
        }

        System.out.println(octal);
    }

    public static void main(String[] args) {
        int d = 91; // Decimal number
        DecToOctal(d); // Expected Output: 133
    }
}
