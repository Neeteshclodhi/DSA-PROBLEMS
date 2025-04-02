public class ArrayUtil {
     
          public void printArray(int[] arr) {
                    int n = arr.length;
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr[i] + " ");
                    }
                    System.out.println();
          }

          public void arrayDemo() {
                    int[] myArray = new int[5]; //default values
                     // printArray(myArray);
                     myArray[0] = 5;
                     myArray[1] = 2;
                     myArray[2] = 4;
                     myArray[3] = 6;
                     myArray[4] = 7;
                     myArray[4] = 20;
                    //  myArray[5] = 7;
                     printArray(myArray);
                     System.out.println(myArray.length);
                     System.out.println(myArray[myArray.length-1]);
          }

          public static void main(String[] args) {
                    ArrayUtil arrUtil = new ArrayUtil();
                    arrUtil.arrayDemo();
          }
}