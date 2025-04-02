import java.util.*;

public class threeSum {
          public List<List<Integer>> threeSum(int[] nums) {
                    List<List<Integer>> result = new ArrayList<>();

                    // sort the array
                    Arrays.sort(nums);

                    // iterate through the array

                    for (int i = 0; i < nums.length - 2; i++) {
                              // skip duplicate elements to avoid repeated triplets

                              if (i > 0 && nums[i] == nums[i - 1])
                                        continue;

                              // define two pointers
                              int left = i + 1;
                              int right = nums.length - 1;

                              // look for pairs that sum to -nums[i]
                              while (left < right) {
                                        int sum = nums[i] + nums[left] + nums[right];

                                        if (sum == 0) {
                                                  // found in triplet
                                                  result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                                                  // skip duplicates for the second element

                                                  while (left < right && nums[left] == nums[left + 1])
                                                            left++;

                                                  // skip duplicates for the third element

                                                  while (left < right && nums[right] == nums[right - 1])
                                                            right--;

                                                  // move both pointers
                                                  left++;
                                                  right--;
                                        } else if (sum < 0) {
                                                  // if the sum is less than zero,move the left pointer to increase the
                                                  // sum
                                                  left++;
                                        } else {
                                                  // if the sum is greater than zero,move the right pointer to decrease
                                                  // the sum
                                                  right--;
                                        }
                              }

                    }

                    return result;
          }

          public static void main(String[] args) {
                    // Create an instance of the class
                    threeSum solution = new threeSum();

                    // Test input array
                    int[] arr = { -1, 0, 1, 2, -1, -4 };

                    // Print the result by calling the instance method
                    List<List<Integer>> result = solution.threeSum(arr);
                    System.out.println(result);
          }
}
