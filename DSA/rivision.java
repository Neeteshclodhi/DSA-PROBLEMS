public class rivision {

       public static void printArr(int[] arr) {
              int n = arr.length;
              for (int i = 0; i < n; i++) {
                     System.out.print(arr[i] + " ");
              }
              System.out.println();
       }

       public static int missing(int[] arr) {
              int n = arr.length + 1;
              int sum = n * (n + 1) / 2;
              for (int num : arr) {
                     sum = sum - num;
              }
              return sum;

       }
public static void main(String[] args) {
       int[] arr = { 1, 2, 3, 5, 6 };
       System.out.println(missing(arr));
}
       
}
