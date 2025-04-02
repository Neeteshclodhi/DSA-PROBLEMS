public class AbudantNumOrNot {

          public static void abudantNum(int n) {
                    int temp = n;
                    int sum = 0;
                    for (int i = 1; i < n; i++) {
                              if (n % i == 0) {
                                    sum+=i;
                              }
                    }
                              if (sum > temp) {
                                        System.out.println("Abudant");
                              } else {
                                        System.out.println(" not Abudant");
                              }
                    
          }
          
          public static void main(String[] args) {
                    int n = 36;
                    abudantNum(n);
          }
}
