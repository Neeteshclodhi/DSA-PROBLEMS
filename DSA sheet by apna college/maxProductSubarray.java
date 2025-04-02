public class maxProductSubarray {
          public static int maxProduct(int[] nums) {
                    int n = nums.length;
                    int leftProduct = 1; //we iniatiaze leftProduct by 1 because there is no leftProduct before the starting of loop
                    int rightProduct = 1;// we iniatiaze 1 because there is no rightProduct before the starting of loop
                    int ans = nums[0];

                    for (int i = 0; i < n; i++) {
                              //if any leftProduct or rightProduct become 0 then update it to 1

                              leftProduct = leftProduct == 0 ? 1 : leftProduct;
                              rightProduct = rightProduct == 0 ? 1 : rightProduct;

                              //prefix product
                              leftProduct *= nums[i];

                              //suffix product
                              rightProduct *= nums[n - 1 - i];

                              ans = Math.max(ans, Math.max(leftProduct, rightProduct));
                    }

                    return ans;
         } 

         public static void main(String[] args) {
                   int[] arr = { 2, 3, -2, -5, 6, -1, 4 };
                   System.out.println(maxProduct(arr));
         }
}
