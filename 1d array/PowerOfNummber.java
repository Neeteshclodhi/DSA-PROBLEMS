public class PowerOfNummber {
      
          public static void main(String[] args) {
                    int base = 5;
                    int exponent = 3;
                    int result = 1;
   
                    //exponent-3,2,1,0 false ,ans is 125
                    while (exponent > 0) {
                              result = result * base; //base-5,1*5=5,5*5=25,25*5=125
                              exponent--;//3,2,1,0
                    }
                    System.out.println(result);
          }
}
