import java.util.*;

public class kthSmallestElement {

          public static void main(String[] args) {
                    // Array of integers
                    int[] nums = { 6, 2, 3, 4, 1, 9 };

                    // The position of the smallest element to find (3rd smallest in this case)
                    int k = 2;

                    // Sorting the array in ascending order
                    Arrays.sort(nums);

                    // Access the (k-1)th element, as arrays are zero-indexed
                    System.out.println(nums[k - 1]);
          }
}
