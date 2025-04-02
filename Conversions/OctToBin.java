public class OctToBin {

          public static int OctToDec(int n) {
                    int decimal = 0;
                    int placeValue = 1;
                    while (n != 0) {
                              int mod = n % 10;
                              decimal = decimal + placeValue*mod;
                              placeValue *= 8;
                              n = n / 10;

                    }
                    return decimal;

          }
          
          public static int DecToBin(int decimal) {
                    int Dec = OctToDec(decimal);
                    int placeValue = 1;
                    int bin = 0;
                    while (Dec != 0) {
                              int rem = Dec % 2;
                               bin = bin + placeValue * rem;
                              placeValue *= 10;
                              Dec = Dec / 2;
                    }
                    return bin;
                    
          }
      public static void main(String[] args) {
                int octNum = 345;
                int decimal1 = OctToDec(octNum);
                int binary1 = DecToBin(decimal1);

                System.out.println("binary number is " + binary1);

 }

            
}
