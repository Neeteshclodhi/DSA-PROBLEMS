
class Main {

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(-3));
    }
}



// public class FactorialOfNum {
        
//           public static int factorialCals(int n) {

//                     if (n == 1 || n == 0) {
//                               return 1;
                    // }
                    
                  // int cF =  factorialCals(n - 1); //first only cF function works only this function calculated the n-1 all values internally then ,goes to the fn function and work on it
                 //  int fn = n * cF; //  * multiple ki jagah + plus kardunga to ye ,sum of n naural number ka answer and solution ban jayega 
                 //  return fn;
        //  }

        //   public static void main(String[] args) {
        //             int n = 5;
        //            int ans =  factorialCals(n);
        //            System.out.println(ans);
                    
        //   }
// }
