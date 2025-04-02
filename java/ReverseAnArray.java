import java.util.*;

public class ReverseAnArray {

    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
//time complexitiy O(1)
        }
    }

    public static void main (String args[]){
        int numbers[]={5,4,3,2,1};
        reverse(numbers);
        //print
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    
    
}
