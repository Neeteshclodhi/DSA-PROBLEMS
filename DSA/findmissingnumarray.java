public class findmissingnumarray {

//very imp 
          public static void printArray(int[] arr) {
                    int n = arr.length;
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr[i] + " ");

                    }
                    System.out.println();
          }


          public static int missingNum(int[] arr) {
                    int n = arr.length + 1;
                    int sum = n * (n + 1) / 2;
                    for (int num : arr) {
                              sum = sum - num;
                    }
                    return sum;
          }
      
          public static void main(String[] args) {
                    int[] arr = {1,2,3,4,5,7,8 };
                    System.out.println(missingNum(arr));
          }
}
