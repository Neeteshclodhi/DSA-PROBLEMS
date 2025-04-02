public class printPairs {


          public static void printArr(int[] arr) {
                    int n = arr.length;
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr[i] + " ");
                    }
                    System.out.println();

          }


          public static void pairs(int[] arr) {
                    int tp = 0;

                    for (int i = 0; i < arr.length; i++) {
                              int curr = arr[i];
                              for (int j = i + 1;  j < arr.length; j++) {

                                        System.out.print("(" + curr + "," + arr[j] + ")");
                                        tp++;
                              }
                              System.out.println();
                    }
                    System.out.println("total pairs is :" + tp);
          }

          public static void main(String[] args) {
                    int[] arr = { 2, 4, 6, 8, 10 };
                    printArr(arr);
                    pairs(arr);
     }
}
