public class PrintArray {
          public static void printArr(int[] arr,int idx ) {
                    if (idx == arr.length) {
                              return;
                    }
          
                              System.out.println(arr[idx]);
                    
                    printArr(arr, idx+1);
                    //  System.out.println(arr[idx]); //reverse array
         } 

     
          public static void main(String[] args) {
                    int[] array = { 5, 6, 7, 8 };
                    int idx = 0;
                    printArr(array, idx);
          }
}
