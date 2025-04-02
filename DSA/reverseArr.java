public class reverseArr {


          public static void printArr(int[] arr) {
                    
                    for (int i = 0; i < arr.length; i++) {
                              System.out.print(arr[i] + " ");
                    }
                    System.out.println();

          }
          public static void reverseArray(int[] arr, int start, int end) {
                    while (start < end) {
                              int temp = arr[start];
                              arr[start] = arr[end];
                              arr[end] = temp;
                              start++;
                              end--;
                    }

          }

          public static void main(String[] args) {
                    int[] arr =  { 1,2,3,4,5};
                    int start = 0;
                    int end = arr.length - 1;
                    reverseArray(arr,start,end);
                    
                    printArr(arr);
    }   
}
