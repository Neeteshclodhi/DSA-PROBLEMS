public class MinNumMergeOpsToMakeArrPalindrome {

          // Function to find the minimum number of merge operations
          // required to make the array palindrome
          static int findMinOps(int[] arr, int n) {
                    int ans = 0; // Initialize result to store count of operations

                    // Start from the two ends (left and right)
                    for (int i = 0, j = n - 1; i <= j;) {
                              // Case 1: If elements at both ends are the same, move inward
                              if (arr[i] == arr[j]) {
                                        i++;
                                        j--;
                              }
                              // Case 2: If left element is greater, merge right two elements
                              else if (arr[i] > arr[j]) {
                                        j--; // Move the right pointer inward
                                        arr[j] += arr[j + 1]; // Merge right two elements
                                        ans++; // Increment merge operation count
                              }
                              // Case 3: If right element is greater, merge left two elements
                              else {
                                        i++; // Move the left pointer inward
                                        arr[i] += arr[i - 1]; // Merge left two elements
                                        ans++; // Increment merge operation count
                              }
                    }

                    return ans; // Return the total number of merge operations
          }

          // Driver method to test the function
          public static void main(String[] args) {
                    // Example array
                    int[] arr = { 1, 4, 5, 9, 1 };
                    // Output the count of minimum operations
                    System.out.println("Count of minimum operations is: " + findMinOps(arr, arr.length));
          }
}
