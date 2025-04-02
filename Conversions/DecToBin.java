public class DecToBin {
          
          public static void main(String[] args) {
                    int n = 10;
                    int bin = 0;
                    int placeValue = 1;
                    while (n > 0) {
                              int rem = n % 2;
                              bin = bin + rem * placeValue;
                              n = n / 2;
                              placeValue *= 10;
                    }
                    System.out.println(bin); //1010
          }
}
