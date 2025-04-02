public class BinToDeci {
       
          public static void main(String[] args) {
                    int n = 1011011;
                    // int temp = n;
                    int ans = 0;
                    int placeValue = 1;
                    while (n != 0) {
                              int ld = n % 10;
                              n = n / 10;
                              ans = ans + ld * placeValue;
                              placeValue =  2 * placeValue;
                    }
                    System.out.println(ans);
          }
}
