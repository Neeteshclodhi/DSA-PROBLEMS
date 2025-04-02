public class maxmininarr {
       
          public static void printArr(int[] arr) {
                    int n = arr.length;
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr[i] + " ");
                    }
                    System.out.println();

          }

          public static int minVal(int[] arr) {
                    int min = arr[0];
                    
                    for (int i =1 ; i < arr.length; i++) {
                              if(arr[i] <min ){
                                        min = arr[i];

                              } 
                              
                              
                    }
                    return min;

          }

          public static void main(String[] args) {
                    int[] arr = { 5, 3, 4, 2, 1 };
                    // printArr(arr);
                    System.out.println(minVal(arr));
                    
          }
}
