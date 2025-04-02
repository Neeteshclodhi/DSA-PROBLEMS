



public class rivision {
           
      public static void bubblSort(int[] arr) {
            int swap = 0;
            for (int turn = 0; turn < arr.length - 1; turn++) {
                  for (int j = 0; j < arr.length - 1 - turn; j++) {
                        if (arr[j] > arr[j + 1]) {
                              int temp = arr[j];
                              arr[j] = arr[j + 1];
                              arr[j + 1] = temp;
                              swap++;
                        }

                  }

            }
             System.out.println("number of swaps is:" + swap);
      }
 

    
      public static void printArr(int[] arr) {
            
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
            System.out.println();
      }
        public static void main(String[] args) {
              int[] arr = { 2, 6, 8, 1, 6, 3, 9 };
              bubblSort(arr);
              printArr(arr);
        }


}
