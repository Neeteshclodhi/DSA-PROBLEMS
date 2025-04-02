public class resizearray {
       
          public static void printArray(int[] arr) {
                    int n = arr.length;
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr[i] + " ");

                    }
                    System.out.println();
          }

          public static int[] resizeArr(int[] arr, int capacity) {
                    int[] temp = new int[capacity];
                    for (int i = 0; i < arr.length; i++) {
                              temp[i] = arr[i];
                    }
                    // arr = temp;
                    //   return arr;
                    return temp;
          }

          public static void main(String[] args) {
                    int[] arr = { 1, 2, 3, 4 };
                    int capacity = arr.length * 2;
                    resizeArr(arr, capacity);
                    printArray(arr);
                    System.out.println(arr.length);

          }
}
