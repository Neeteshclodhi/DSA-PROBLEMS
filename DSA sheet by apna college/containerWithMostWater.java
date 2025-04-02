import java.util.*;

public class containerWithMostWater {
          // Function to calculate the maximum area of water that can be contained
          public static int maxArea(int[] height) {
                    int left = 0; // Pointer starting from the left side of the array
                    int right = height.length - 1; // Pointer starting from the right side of the array
                    int maxArea = 0; // Variable to store the maximum area found so far

                    // Loop until the two pointers meet
                    while (left < right) {
                              // Calculate the area formed by the lines at the left and right pointers
                              int area = Math.min(height[left], height[right]) * (right - left);

                              // Update maxArea if the current area is larger than the previously found area
                              maxArea = Math.max(area, maxArea);

                              // Move the pointer with the smaller height to attempt to find a larger area
                              if (height[left] < height[right]) {
                                        left++; // Move the left pointer to the right
                              } else {
                                        right--; // Move the right pointer to the left
                              }
                    }
                    return maxArea; // Return the maximum area found
          }

          // Main method to test the maxArea function
          public static void main(String[] args) {
                    int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 }; // Example input array representing the heights
                    System.out.println(maxArea(arr)); // Output the maximum area of water that can be contained
          }
}
