import java.util.*;

public class productOfArrExceptSelf {
          public static int[] productExceptSelf(int[] nums) {
                    //Array to store all left multiplication
                    int[] left = new int[nums.length];
                    //array to store all right multiplication
                    int[] right = new int[nums.length];

                    left[0] = 1;
                    for (int i = 1; i < nums.length; i++) {
                              left[i] = left[i - 1] * nums[i - 1];
                    }
                    right[nums.length - 1] = 1;
                    for (int i = nums.length - 2; i > -1; i--) {
                              right[i] = right[i + 1] * nums[i + 1];
                    }

                    int[] ans = new int[nums.length];
                    for (int i = 0; i < nums.length; i++) {
                              ans[i] = left[i] * right[i];
                    }
                    return ans;
          }

          public static void main(String[] args) {
                    int[] arr = { 2, 1, 3, 4 };
                    int[] ans = productExceptSelf(arr);
                    System.out.println(Arrays.toString(ans));
          }
}
