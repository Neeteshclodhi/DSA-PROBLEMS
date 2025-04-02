
class ABC {

          public static void multiple(int n, int k) {
                    if (k == 0) {
                              return;
                    } //or
                      //   if (k == 1) {
                      //           System.out.println(n);
                      //           return;
                      //         }


                      //Recursive work
                      multiple(n, k - 1);
                    
                      //self work
                    System.out.println(n * k);
          }

    public static void main(String[] args) {
        int n = 12;
        int k = 5;
        multiple(n, k);

    }

}