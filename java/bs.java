import java.util.*;

public class bs {
    public static int  binaryMax(int numbers[],int key){
        int start=0,end=numbers.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }if(numbers[mid]<key){
                start=start+1;
            }if(numbers[mid]>key){
                end=end-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,6,7,8,1,12,1,4,9,3,5,2,7,4,9};
        int key=9;
        System.out.println("key is at index:"+binaryMax(numbers,key));
    }
    
}
