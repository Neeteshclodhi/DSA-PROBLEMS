public class PairWithSumInRotatedSortedArray {

          public static boolean pairWithSum(int[] arr, int n, int x) {
                    // find the pivot element
                    int i;
                    for (i = 0; i < n - 1; i++) {
                              if (arr[i] > arr[i + 1]) {
                                        break;
                              }
                    }

                    int l = (i + 1) % n; // l is now the index of the smallest element ,left pointer(l)
                    int r = i; // r is now the index of the largest element,right pointer(r)

                    // keep  moving until l and r meet
                    while (l != r) {
                              // if we find a pair with sum x, we return true
                              if (arr[l] + arr[r] == x) {
                                        return true;
                              }

                              // if the current pair sum is less, move to the higher sum side
                              if (arr[l] + arr[r] < x) {
                                        l = (l + 1) % n;
                              } else { // move to the lower sum side
                                        r = (n + r - 1) % n;
                              }
                    }

                    return false; // if no pair is found
          }

          public static void main(String[] args) {
                    int[] arr = { 11, 15, 6, 8, 9, 10 };
                    int key = 16;
                    System.out.println(pairWithSum(arr, arr.length, key)); // Expected output: true
          }
}
