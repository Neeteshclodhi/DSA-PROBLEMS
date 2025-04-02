
public class bubblesort {

    // ✅ Step 1: Implement Bubble Sort
    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) { // Loop runs n-1 times
            for (int j = 0; j < n - i - 1; j++) { // Inner loop runs (n-i-1) times
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ✅ Step 2: Print the Array
    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {13, 26, 24, 52, 20, 9};
        int n = arr.length;

        System.out.println("Original Array:");
        printArr(arr);

        // Sorting the array
        bubbleSort(arr, n);

        System.out.println("Sorted Array:");
        printArr(arr);
    }
}





// public class bubblesort {

//     public static void BubbleSort(int arr[], int n) {

//         for (int i = n - 1; i >= 0; i--) { //this loops runs one less time to n
//             for (int j = 0; j <= i - 1; j++) { //this loop runs one less time to i
//                 if (arr[j] > arr[j + 1]) {
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int[] arr = { 13, 26, 24, 52, 20, 9 };
//         int n = arr.length;

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         BubbleSort(arr, n);
//         printArr(arr);
//     }
// }







// public class bubblesort {
    // bubble sort me bigger element ko end me le jate hai
    // time complexity O(n2)
    // public static void bubbleSorting(int arr[]) {
    //     int swaps = 0;
    //     for (int turn = 0; turn < arr.length - 1; turn++) {
    //         for (int j = 0; j < arr.length - 1 - turn; j++) {
    //             if (arr[j] > arr[j + 1]) {
                    // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swaps++;
//                 }
//                 System.out.println("no.of swaps is:" + swaps);
//             }
//         }
//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = { 2, 5, 7, 2, 5, 9, 1, 8 };
//         bubbleSorting(arr);
//         printArr(arr);
//     }
// }
// DRY RUN OF THIS CODE
// Given array: [8, 9, 2, 3, 7]

/*
 * First pass:
 * Compare 8 and 9, no swap needed.
 * Compare 9 and 2, swap because 9 > 2.
 * Compare 9 and 3, swap because 9 > 3.
 * Compare 9 and 7, swap because 9 > 7.
 * Array becomes: [8, 2, 3, 7, 9]
 * Second pass:
 * Compare 8 and 2, swap because 8 > 2.
 * Compare 8 and 3, no swap needed.
 * Compare 8 and 7, no swap needed.
 * Array becomes: [2, 3, 7, 8, 9]
 * Third pass:
 * Compare 2 and 3, no swap needed.
 * Compare 3 and 7, no swap needed.
 * Array remains: [2, 3, 7, 8, 9]
 * Fourth pass:
 * Compare 2 and 3, no swap needed.
 * Array remains: [2, 3, 7, 8, 9]
 * The array is now sorted.
 */
