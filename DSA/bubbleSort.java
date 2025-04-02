public class bubbleSort {
           


          public static void printArray(int[] arr) {
                    int n = arr.length;
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr[i] + " ");

                    }
                    System.out.println();
          }

          public static void bubSort(int[] arr) {
                    boolean isSwapped;
                    for (int i = 0; i < arr.length - 1; i++) { //count passes
                              isSwapped = false;
                              for (int j = 0; j < arr.length - 1 - i; j++) {
                                        if (arr[j] > arr[j + 1]) {
                                                  int temp = arr[j];
                                                  arr[j] = arr[j + 1];
                                                  arr[j + 1] = temp;
                                                  isSwapped = true;
                                        }

                              }
                              if (isSwapped == false) {
                                        break;
                              }

                    }
          }
          
          public static void main(String[] args) {
                    int[] array ={4,3,2,1} ;
                    bubSort(array);
                    printArray(array);
          }



          
}

