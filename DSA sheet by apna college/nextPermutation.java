  
import java.util.*;

public class nextPermutation {
          // Function to find the next permutation of the given array
          public static void nextPer(int[] arr) {
                    int n = arr.length;
                    if (n <= 1)
                              return; // If the array has only 1 element or is empty, no need to process

                    // Step 1: Find the largest index 'i' such that arr[i] < arr[i+1]
                    int i = n - 2;
                    while (i >= 0 && arr[i] >= arr[i + 1]) {
                              i--; // Keep moving left until we find a point where arr[i] < arr[i+1]
                    }

                    // Step 2: If such an index 'i' was found, we need to find a number larger than
                    // arr[i]
                    if (i >= 0) {
                              int j = n - 1;
                              // Find the largest index 'j' where arr[j] > arr[i]
                              while (arr[j] <= arr[i]) {
                                        j--;
                              }
                              // Step 3: Swap the elements at arr[i] and arr[j]
                              swap(arr, i, j);
                    }

                    // Step 4: Reverse the elements after index 'i' to get the smallest
                    // lexicographical order
                    reverse(arr, i + 1, n - 1);
          }

          // Helper function to swap two elements in the array
          private static void swap(int[] arr, int i, int j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
          }

          // Helper function to reverse a portion of the array from 'start' to 'end'
          private static void reverse(int[] arr, int start, int end) {
                    while (start < end) {
                              swap(arr, start, end); // Swap elements from the two ends
                              start++;end--;
                    }
          }

          public static void main(String[] args) {
                    // Example input: {1, 3, 5, 4, 2}
                    int[] arr = { 1, 3, 5, 4, 2 };
                    System.out.println("Original array: " + Arrays.toString(arr));

                    // Call the function to get the next permutation
                    nextPer(arr);

                    // Output the resulting next permutation
                    System.out.println("Next permutation: " + Arrays.toString(arr));
          }
}

                              