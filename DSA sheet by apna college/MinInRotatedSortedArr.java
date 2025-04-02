public class MinInRotatedSortedArr {
//O(logn)
          // This method finds the minimum element in a rotated sorted array.
          public static int minRotatedSortedAr(int[] arr) {

                    // Initialize the two pointers: low and high
                    int low = 0;
                    int high = arr.length - 1;

                    // Perform binary search by adjusting low and high pointers
                    while (low < high) {
                              // Calculate the middle index to divide the array
                              // Mid Calculation: The calculation low + (high - low) / 2 is used instead of
                              // (low + high) / 2 to avoid potential integer overflow issues.
                              int mid = low + (high - low) / 2;

                              // If the middle element is greater than the element at 'high',
                              // the minimum must be in the right half (mid + 1 to high).
                              if (arr[mid] > arr[high]) {
                                        low = mid + 1;
                              }
                              // Otherwise, the minimum is either at mid or in the left half (low to mid)
                              else {
                                        high = mid;
                              }
                    }

                    // At the end, low and high will converge to the index of the minimum element
                    return arr[high]; // Since arr[low] == arr[high], either can be returned
          }

          public static void main(String[] args) {
                    // Example of a rotated sorted array
                    int[] nums = { 6, 7, 1, 2, 3, 4, 5 };

                    // Print the minimum element in the rotated sorted array
                    System.out.println(minRotatedSortedAr(nums));
          }
}
