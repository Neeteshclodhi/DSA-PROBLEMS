
import java.util.*;
public class xyz {


          public static void main(String[] args) {
                    int n = 6;
                    List<Integer> list = new ArrayList<>();

                    for (int i = 1; i <= n * n; i++) {
                              if (n % i == 0) {
                                        list.add(i);
                              } else if ((n % i) != i) {
                                        list.add(n / i);
                              }
                              System.out.println(list);
                    }
       
          }
          
}
