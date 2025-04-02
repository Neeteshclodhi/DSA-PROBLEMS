public class moveZeroAtEnd {

          

        public static void printArr(int[] arr) {
            for (int num : arr) { // Enhanced for loop
                System.out.print(num + " ");
            }
            System.out.println();
        }

        public static void moveZeroes(int[] arr, int n) {
            int j = 0; // Focused on zero index

            for (int i = 0; i < n; i++) { // Normal for loop required here
                if (arr[i] != 0 && arr[j] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (arr[j] != 0) {
                    j++;
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 0, 3, 5, 0, 2, 0};
            moveZeroes(arr, arr.length);
            printArr(arr);
        }
    }


