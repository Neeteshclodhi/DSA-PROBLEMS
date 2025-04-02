public class ReplaceZeroToOne {
          
          static int replaceZerosWithOnes(int num) {
        if (num == 0) {
            return 1;
        }
        int ans = 0, tmp = 1;
        while (num > 0) {
            int ld = num % 10;
            if (ld == 0) {
                ld = 1;
            }
            ans = ld * tmp + ans;
            num = num / 10;
            tmp = tmp * 10;
        }
        return ans;
    }

    public static void main(String[] args) {

        int n = 204;
        int result = replaceZerosWithOnes(n);
        System.out.println("After replacing zeros with ones " + n + " becomes " + result);
    }
}
