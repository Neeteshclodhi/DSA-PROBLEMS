public class insertionSort {


          public static void printArr(int[] arr) {
                    int n = arr.length;
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr[i] + " ");
                    }
                    System.out.println();
          }


          public static void inserSort(int[] arr ) {
                    int n = arr.length;
                    for (int i = 1; i < n; i++) {//unsorted part
                              int temp = arr[i];
                              int j = i - 1; //sorted part
                              while (j >= 0 && arr[j] > temp) {
                                        arr[j + 1] = arr[j];//shifting larger elements to temp by 1 position
                                        j = j - 1;
                              }
                              arr[j + 1] = temp;

                    }
          }

          public static void main(String[] args) {
                    int[] array = { 5,1,2,9,10 };
                    printArr(array);
                     inserSort(array);
                    printArr(array);

     }   
}
