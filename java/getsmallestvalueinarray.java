import java.util.*;

public class getsmallestvalueinarray {
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    // time complexity O(n)
    public static void main(String args[]) {
        int numbers[] = { 3, 5, 6, 9, 1 };
        System.out.println("smallest value is:" + getSmallest(numbers));
    }

}
