import java .util.*;

public class kadans {
    public static void printKadans(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<=numbers.length-1;i++){
            cs=cs+numbers[i];
            if (cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("our max subarray sum:"+ms);
    } 
    public static void main(String args[]){
        int numbers[]={1,-7,5,8};
        printKadans(numbers);
    }
    
}
