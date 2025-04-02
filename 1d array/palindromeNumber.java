
public class palindromeNumber {

    public static boolean palindromeNum(int n) {
        int temp = n;
        int revNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        if (temp == revNum) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int n = 11112;

        System.out.println(palindromeNum(n));

    }
}
