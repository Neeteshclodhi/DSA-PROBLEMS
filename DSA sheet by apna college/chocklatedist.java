import java.util.*;

public class chocklatedist {
          // Function to find the minimum difference between the maximum and minimum
          // values
          // of any m chocolates distributed to students
          // public static int chocolate(int[] arr, int n, int m) {
          //           // Sort the array
          //           Arrays.sort(arr);
          //           int min = Integer.MAX_VALUE;

          //           // Traverse the array and find the minimum difference
          //           for (int i = 0; i + m - 1 < n; i++) {
          //                     int diff = arr[i + m - 1] - arr[i];
          //                     if (diff < min)
          //                               min = diff;
          //           }
          //           return min;
          // }

          // public static void main(String[] args) {
          //           // Example array of chocolates and number of students
          //           int[] arr = { 3, 4, 1, 9, 56, 7, 9, 12 };
          //           int n = arr.length;
          //           int m = 5;

          //           // Print the result of the chocolate distribution
          //           System.out.print(chocolate(arr, n, m));
          // }


          public static long findMinDiff(ArrayList<Integer> a, int n, int m) {
        if (a.size() == 0 || m == 0 || m > n) {
            return 0; // Handle edge cases
        }
        Collections.sort(a);
        long res = Long.MAX_VALUE;

        for (int i = 0; i < n - m + 1; i++) {
            int minElement = a.get(i);
            int maxElement = a.get(i + m - 1);
            res = Math.min(res, maxElement - minElement);
        }
        return res;
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int n = arr.length;
        int m = 5;

        // Convert array to ArrayList
        ArrayList<Integer> chocolatePackets = new ArrayList<>(Arrays.asList(arr));

        // Call the method
        long result = findMinDiff(chocolatePackets, n, m);
        System.out.print("Minimum difference is: " + result);
    }

}
