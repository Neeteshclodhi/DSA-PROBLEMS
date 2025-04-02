public class countDigit {

          public static int countDigit(int n) {
                    int count = 0;
                    while (n > 0) {
                              int lG = n % 10;
                              count = count + 1;
                              n = n / 10;
                    }
                    return count;
          }

        
    public static void main(String[] args) {
              int n = 13432;
              System.out.println(countDigit(n));
    }
}
