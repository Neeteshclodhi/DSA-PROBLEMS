import java.util.*; 

public class searchkeyinsortedmatrix {

    public static boolean staircaseSearch(int matrix[][],int key){
        int row = 0,col=matrix[0].length-1;
        while(row<matrix.length && col >= 0){
            if(matrix[row][col]==key){
                System.out.println("found key at (" + row + " ," + col +")");
                return true;
            }// time complexity for this code is O(n+m)
            else if( key <matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;//burst case me time complexity O(n) and O(m)
    }

    public static void main(String args[]){
        int matrix[][]=  {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
       int key=33;                    
       staircaseSearch(matrix,key);
    }   
}
