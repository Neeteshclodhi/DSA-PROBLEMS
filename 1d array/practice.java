
public class practice {

    public static void harshadNum(int n) {

        int sum = 0;
        int temp = n;
        while (n > 0) {

            int ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }
        if (temp % sum == 0) {
            System.out.println("it is a harshad number");
        } else {
            System.out.println("it is not a harshad number");
        }
                
    
    }

    public static void main(String[] args) {
        int num = 120;
        harshadNum(num);


    }

}