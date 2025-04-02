import java.util.*;

public class repeatAndMissNum {

          public static int[] findTwoElement(int arr[], int n) {
                    int rep = 0; // To store the repeated number
                    int miss = 0; // To store the missing number

                    // HashMap to track occurrences of numbers
                    HashMap<Integer, Boolean> map = new HashMap<>();
                    //key   value
                    //1     true
                    //2      true
                    //null   null
                    //4      true
                    //5      true
                    // First loop: Identify the repeated number
                    for (int i = 0; i < n; i++) {
                              // If the number is not present in the map, add it
                              if (map.get(arr[i]) == null) {
                                        map.put(arr[i], true);
                              } else {
                                        // If it is already present, this is the repeated number
                                        rep = arr[i];
                              }
                    }

                    // Second loop: Identify the missing number
                    for (int i = 1; i <= n; i++) {
                              // If the number 'i' is not in the map, it is the missing number
                              if (map.get(i) == null) {
                                        miss = i;
                              }
                    }

                    // Return the repeated and missing numbers as an array
                    return new int[] { rep, miss };
          }

          public static void main(String[] args) {
                    // Sample array with one repeated and one missing number
                    int[] arr = { 1, 2, 2, 3, 4, 5 };

                    // Call the function and store the result
                    int[] result = findTwoElement(arr, arr.length);

                    // Use Arrays.toString() to properly print the result array
                    System.out.println(Arrays.toString(result));
          }
}
