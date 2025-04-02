public class OctToDec {

          public static void octToDec(int n) {
                    
                    int placeValue = 1;
                    int dec = 0;
                    while (n > 0) {
                              int rem = n % 10;
                              dec = dec + rem * placeValue;
                              placeValue *= 8;
                              n = n / 10;
                    }
                    System.out.println(dec);
          }
         
          public static void main(String[] args) {
                    int oct = 13;
                    octToDec(oct);

          }
}
