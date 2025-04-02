import java.util.*;

public class searchinsortedrotedar {

          // Function to search for a target in a rotated sorted array
          public static int search(int[] arr, int n, int target) {
                    int low = 0;
                    int high = n - 1;

                    // Binary search loop
                    while (low <= high) {
                              // Calculate mid index
                              int mid = low + (low + high) / 2;

                              // Check if mid element is the target
                              if (arr[mid] == target)
                                        return mid;

                              // Check if the left half is sorted
                              if (arr[low] <= arr[mid]) {
                                        // Check if target is in the left half
                                        if (arr[low] <= target && target <= arr[mid]) {
                                                  high = mid - 1;
                                        } else {
                                                  low = mid + 1;
                                        }
                              } else {
                                        // Check if target is in the right half
                                        if (arr[mid] <= target && target <= arr[high]) {
                                                  low = mid + 1;
                                        } else {
                                                  high = mid - 1;
                                        }
                              }
                    }
                    // Target not found
                    return -1;
          }

          public static void main(String[] args) {
                    // Example array and target
                    int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
                    int target = 1;
                    int n = arr.length;

                    // Print the result of the search
                    System.out.println(search(arr, n, target));
          }
}
