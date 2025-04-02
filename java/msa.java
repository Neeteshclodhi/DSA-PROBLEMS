import java.util.*;

public class msa {
    public static void printSubarray(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {// print
                    
                    System.out.print(numbers[k] + " " );// subarrays
                    tp++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays is:" + tp);
    }

    public static void main(String args[]) {

        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarray(numbers);
    }

}
