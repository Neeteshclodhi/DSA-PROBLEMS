

public class Kadane {

    public static int maxSubArraySum(int[] arr) {
        int maxSum = arr[0], currSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum: " + maxSubArraySum(arr));
    }
}

// public class Maximumsuminsubarray {

//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;
//                 currSum = 0;
//                 for (int k = start; k <= end; k++) {// print
//                     // subarray sum
//                     currSum += numbers[k];
//                     // time complexity O(n3)
//                 }
//                 System.out.println(currSum);
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("max sum is = " + maxSum);
//     }

//     public static void main(String args[]) {
//         int numbers[] = { 2, 4, 6, 8, 10 };
//         maxSubarraySum(numbers);
//     }
// }
