public class SwapNumWithoutUsingThirdVar {
          
          public static void main(String[] args) {
                    int a = 10;
                    int b = 20;
                  //  System.out.println("Before swapping value of a is = " + a + " b is = " + b + " ");

                    // use + and - without using third variable
                  //  a = a+b; //10+20=30
                  //  b = a - b; //30-20=10
                  //  a = a - b; //30-10 = 20
                  //  System.out.println("After swapping value of a is = " + " "  + a + "  b is = " + b + " ");

                  //use * and / operator

                  a = a * b; //10*20=200
                  b = a / b; //200/20 = 20
                  a = a / b; //200/20 = 20
          }
}
