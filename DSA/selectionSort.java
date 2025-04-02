 public class selectionSort {
           //we have two prs sorted part and unsorted part in which sorted part in starting is empty
          public static void printArray(int[] arr) {
                   int n = arr.length;
                     for (int i = 0; i < n; i++) {
                              System.out.print(arr[i] + " ");
                     }
                     System.out.println();
           }

           public static void sSort(int[] arr) {
                   int n = arr.length;
                    for (int i = 0; i < n - 1; i++) {
                             int min = i;
                              for (int j = i + 1; j < n; j++) {
                                        if (arr[j] < arr[min]){
                                                 min = j;
                               }
                     }
                    int temp = arr[min];
                    arr[min] = arr[i];
                   arr[i] = temp;
          }
 }
           public static void main(String[] args) {
                  int[] arr = { 5, 1, 2, 9, 10 };
                  printArray(arr);
                   sSort(arr);
                   
                   printArray(arr);
          }
 }

// public class selectionSort {
//           // We have two parts: sorted part and unsorted part, with the sorted part
//           // initially empty
//           public static void printArray(int[] arr) {
//                     int n = arr.length;
//                     for (int i = 0; i < n; i++) {
//                               System.out.print(arr[i] + " ");
//                     }
//                     System.out.println();
//           }

//           public static void sSort(int[] arr) {
//                     int n = arr.length;
//                     for (int i = 0; i < n - 1; i++) {
//                               int min = i;
//                               for (int j = i + 1; j < n; j++) {
//                                         if (arr[j] < arr[min]) {
//                                                   min = j;
//                                         }
//                               }
//                               // Swap the found minimum element with the first element
//                               int temp = arr[min];
//                               arr[min] = arr[i];
//                               arr[i] = temp;
//                     }
//           }

//           public static void main(String[] args) {
//                     int[] arr = { 5, 1, 2, 9, 10 };
//                     sSort(arr);
//                     printArray(arr);
//           }
// }
