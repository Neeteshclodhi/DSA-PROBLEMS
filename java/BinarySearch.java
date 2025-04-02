import java.util.*;


public class BinarySearch {

    public static int binarySerch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // for sorted array

            // comparison
            if (numbers[mid] == key) {// mid
                return mid;

            }
            if (numbers[mid] < key) {// right
                start = mid + 1;
            }
            if (numbers[mid] > key) {// left
                end = mid - 1;
                // time complexity for this code is O(logn)
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 6 ,7,8,9};
        int key = 8;
        System.out.println("key value is :" + binarySerch(numbers, key));
    }

}
