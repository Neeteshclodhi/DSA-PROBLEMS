public class reversearr {
          public static void printArr(int[] arr) {
                    int n = arr.length;
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr[i] + " ");
                    }
                    System.out.println();

          }
          
          public static void revArr(int[] arr, int start, int end) {
                    while (start < end) {
                              int temp = arr[start];
                              arr[start] = arr[end];
                              arr[end] = temp;
                              start++;
                              end--;
                    }
          }

          public static void main(String[] args) {
                    int[] arr = { 5, 4, 3, 2, 1 };
                    printArr(arr);
                    revArr(arr, 0, arr.length - 1);
                    printArr(arr);
          }
}
