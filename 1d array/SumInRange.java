public class SumInRange {

          public static void main(String[] args) {
                    int f = 2;
                    int l = 7;
                    int sum = 0;
                    for (int i = f; i <= l; i++) {
                              sum = sum + i;
                    }
                    System.out.println(sum);
          }
}





// public class Main {

//     public static void main(String args[]) {
//         int l = 2, r = 7; //Time Complexity: O(1), since we are finding sum from 1 to r and sum from 1 to l-1 in O(1) complexity.
//         //sum(1 to r) - sum(1 to l-1)
//         int ans = (r * (r + 1)) / 2 - ((l - 1) * (l)) / 2;
//         System.out.print("The sum of the numbers in the given range is " + ans);
//     }
// }
