
import java.util.*;

public class Divisors {

    public static void printDivisors(int n) {
        // A TreeSet is used to store divisors in sorted order
        TreeSet<Integer> divisors = new TreeSet<>();

        // Iterate up to sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);         // Add the smaller divisor
                divisors.add(n / i);     // Add the larger divisor
            }
        }

        // Print all divisors
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }

    public static void main(String[] args) {
        int n = 36; // Example number
        System.out.println("Divisors of " + n + " are:");
        printDivisors(n);
    }
}
