import java.util.*;
public class duplicatearr1 {
          //O(n2)
          // //1st way to solve this problem
          // public static boolean dupliArr(int[] nums) {
          //           for (int i = 0; i < nums.length; i++) {
          //                     for (int j = i + 1; j < nums.length; j++) {
          //                               if (nums[i] == nums[j]) {
          //                                         return true;
          //                               }
          //                     }
          //           }
          //           return false;
          // }

          //2nd way to solve this problem
          //O(n)
           public static  boolean duplicateAr(int[] nums){
                    Arrays.sort(nums);
                    for (int i = 0; i < nums.length - 1; i++) {
                              if (nums[i] == nums[i + 1]) {
                                        return true;
                              }
                    }
                    return false;
          }

          //3rd way
          //O(n) but good compare two of these

          //this code not working properly but when  i study of hashset then i willl solve it
          // public static boolean duplicateAr(int[] nums) {
          //           HashSet<Integer> numbers = new HashSet<>();
          //           for (int i = 0; i < nums.length; i++) {
          //                     if (numbers.contains(nums[i])) {
          //                               return true;
          //                               numbers.add(nums[i]);
          //                     }
          //                     return false;

          //           }

          // }




          public static void main(String[] args) {
                    int[] arr = {1, 2, 3, 1 };
                    System.out.println(duplicateAr(arr));
          }
}
