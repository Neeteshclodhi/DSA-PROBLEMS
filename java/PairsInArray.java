import java.util.*;

public class PairsInArray {

    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];// 2,4,6,8,10
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            } // Time complexity for this code O(n2)
              //formula to calculate total pairs in array n(n-1)/2
            System.out.println();
        }
        System.out.println("total pairs is:" + tp);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printPairs(numbers);
    }

}
