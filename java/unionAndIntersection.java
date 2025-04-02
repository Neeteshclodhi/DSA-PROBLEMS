
import java.util.*;

class unionAndIntersection {

    public static void union(int[] arr1, int[] arr2) {
        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            if (union.contains(num)) {
                intersection.add(num);
            } else {
                union.add(num);
            }
        }
        System.out.println(union);
        System.out.println(intersection);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        union(arr1, arr2);
    }
}
