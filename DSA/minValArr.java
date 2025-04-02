public class minValArr {
          public static void printArr(int[] arr) {

                    for (int i = 0; i < arr.length; i++) {
                              System.out.print( arr[i] + " ");
                    }
                    System.out.println();

          }
          
          public static int minValue(int[] arr) {
                    if (arr == null || arr.length == 0) {
                              throw new IllegalArgumentException("Invalid input");
                    }
                    int min = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                              if (arr[i] < min) {
                                        min = arr[i];
                              }

                    }
                    return min;
          }

          public static void main(String[] args) {
                    int[] numbers = {12,34,6,7,10};
                    printArr(numbers);
                    System.out.println( minValue(numbers));
                    
          }
}
