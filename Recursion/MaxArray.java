public class MaxArray {
          public static int max(int[] arr, int idx) {
                    if (idx == arr.length - 1) {
                              return arr[idx];
                    }
                    int smallAns = max(arr, idx + 1); //believe on arr[idx+1] that give the max value from arr[idx]
                    return Math.max(arr[idx], smallAns); //arr[idx] is a current or first element
          }
       public static void main(String[] args) {
                 int arr[] = { 5, 6, 7, 9 };
                 int idx = 0;
                 System.out.println(max(arr,idx));
       }   
}
