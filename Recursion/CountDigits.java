public class CountDigits {
             //believe -leap of faith
          public static int digitCounter(int n) {
                    if (n >= 0 && n <= 9) {
                              return 1;
                    }
                    int RemDigits = digitCounter(n / 10);
                    RemDigits++;
                    return RemDigits;

          }
       
          public static void main(String[] args) {
                    System.out.println(digitCounter(2315));
          }
}
