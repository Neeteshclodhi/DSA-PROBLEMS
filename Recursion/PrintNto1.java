// package Recursion;
import java.util.*;

// package Recursion;



public class PrintNto1 {

          public static void printDecNto1(int n) {

                    if (n == 1) {
                              System.out.println(n);
                              return;
                    }
                    System.out.print(n+" ");
                    printDecNto1(n - 1);
                    
          }
public static void main(String[] args) {
          int n = 10;
          printDecNto1(n);    
}
}
