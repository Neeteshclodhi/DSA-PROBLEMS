public class PowOfPAndQ {
      
          public static int pow(int p,int q) {
                 
                    if (q == 0) //curly braces are optional
                              return 1;
                    return pow(p, q - 1) * p;
          }
          public static void main(String[] args) {
                    System.out.println(pow(5,4));
          }
}
