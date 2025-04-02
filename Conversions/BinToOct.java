
public class BinToOct {
     //placeValue jis number ka conversion karte hai uski base hi placevalue rahti samhj lene question ke hsab se
    // ✅ Step 1: Convert Binary to Decimal
    public static int BinToDec(int n) {
        int ans = 0;
        int placeValue = 1; // Represents powers of 2

        while (n > 0) {
            int ld = n % 10;  // Get last digit
            ans = ans + ld * placeValue;  // Multiply by power of 2
            placeValue *= 2;  // Increase power of 2
            n = n / 10;  // Remove last digit
        }
        return ans;
    }

    // ✅ Step 2: Convert Decimal to Octal
    public static int DecToOctal(int decimal1) {
        int decimal = BinToDec(decimal1); // Convert binary to decimal
        int octal = 0;
        int placeValue = 1; // Represents powers of 10

        while (decimal > 0) {
            int mod = decimal % 8;  // Get remainder
            octal = octal + mod * placeValue;  // Build octal number
            placeValue *= 10; // Increase power of 10
            decimal = decimal / 8;  // Reduce decimal number
        }
        return octal;
    }

    


    public static void main(String[] args) {
              int bin = 1100100;//1011011-133; // Binary Input

        // Convert Binary to Octal
        int octal = DecToOctal(bin);

        

        System.out.println("Original Binary: " + bin);
        System.out.println("Converted Octal: " + octal);

    }
}
