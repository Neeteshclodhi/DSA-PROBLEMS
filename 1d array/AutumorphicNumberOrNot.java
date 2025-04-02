public class AutumorphicNumberOrNot {

          public static boolean isAutomorphic(int N) {
                
                    int sq = N * N;

                    while (N > 0) {
                              if (N % 10 != sq % 10) {
                                        return false;
                              } else {
                                        N = N / 10;
                                        sq = sq / 10;
                              }
                    }
                    return true;
          }
          public static void main(String[] args) {
                    int N = 6;
                    if (isAutomorphic(N) == true) {
                              System.out.println("Number is Automorphic");
                    } else {
                              System.out.println("Number is not Automorphic");
                    }
          }
          
}