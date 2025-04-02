
public class NaturalNumSum {

    public static int sum(int n) {
        if (n == 0) {
            return n;
        }
        //     return sum(n-1)+n;
        int ans1 = sum(n - 1);
        int ans2 = ans1 + n;
        return ans2;
    }

    public static void main(String[] args) {

        System.out.println(sum(6));
    }
}









// package Recursion;

// public class NaturalNumSum {
        
//           public static void naturalNumSum(int i, int n, int sum) {
//                     if (i == n) {
//                               sum += i;
//                               System.out.println(sum);
//                               return;
//                     }
//                     sum += i;
//                     naturalNumSum(i + 1, n, sum);
//                     // System.out.println(i); //this line just for logic,how things works internally
//           }
                    
//           public static void main(String[] args) {
//                     naturalNumSum(1, 5, 0);  
//           }
// }


