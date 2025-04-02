
public class QuickSort {

    // Function to perform QuickSort
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Get pivot index
            quickSort(arr, low, pivotIndex - 1); // Sort left partition
            quickSort(arr, pivotIndex + 1, high); // Sort right partition
        }
    }

    // Partition function
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low]; // Step 1: Choose first element as pivot
        int i = low, j = high;

        while (i < j) {
            // Step 3.1: Increment i until arr[i] > pivot
            while (i < high && arr[i] <= pivot) {
                i++;
            }
            // Step 3.2: Decrement j until arr[j] < pivot
            while (arr[j] > pivot) {
                j--;
            }
            // Step 3.3: Swap arr[i] and arr[j] if i < j
            if (i < j) {
                swap(arr, i, j);
            }
        }
        // Step 4: Swap pivot with arr[j] (final pivot position)
        swap(arr, low, j);
        return j; // Pivot index
    }

    // Function to swap two elements
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print array
    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {24, 9, 29, 14, 19, 27};
        int n = arr.length;

        System.out.println("Original Array:");
        printArr(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        printArr(arr);
    }
}
