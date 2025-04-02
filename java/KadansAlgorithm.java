import java.util.*;

public class KadansAlgorithm {

    public static void kadansAlgorithm(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subarray sum is :" + ms);
         //Kadans algorithm very important for every interview
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadansAlgorithm(numbers);
    }

}
