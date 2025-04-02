import java.util.*;

public class LongestCommonPrefix {

          public static int lengthOfLongestCommonPrefix(String[] strs) {
                    StringBuilder result = new StringBuilder();
                    // sort the array
                    Arrays.sort(strs);

                    // get the first and last string
                    char[] first = strs[0].toCharArray(); // .toCharArray(): This converts the string into a character
                                                          // array. Each character of the string becomes an element of
                                                          // this array. This allows you to easily access each character
                                                          // for comparison.
                    char[] last = strs[strs.length - 1].toCharArray(); //first: Holds the characters of the first string in the sorted array.
                                                                       //last: Holds the characters of the last string in the sorted array.

                    // start comparing
                    for (int i = 0; i < first.length; i++) {
                              if (first[i] != last[i])
                                        break;
                              result.append(first[i]);
                    }
                    // return result.toString(); //ye wala function use karna ho tab hum static int ko static string bana denge tabhi ye wala code work karega
                    return result.length(); // Return the length of the prefix
          }

          public static void main(String[] args) {
                    String[] arr = { "flower", "flow", "flown" };
                    System.out.println("Length of the longest common prefix: " + lengthOfLongestCommonPrefix(arr));
          }
}
