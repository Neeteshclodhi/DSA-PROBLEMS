



public class insertionsort {// time complexity O(n2) teeno ki time complexitiy same hai

    public static void InsertionSort(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } 
                
            }
        }
    }

        public static void printArr(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        System.out.println();
        }
        
    
   public static void main(String[] args) {
       int arr[] = { 5,3,4,1,2 };
       int n = arr.length;
       printArr(arr);
       InsertionSort(arr, n);
       printArr(arr);
   }

}
































// import java.util.*;

// public class insertionsort {// time complexity O(n2) teeno ki time complexitiy same hai

//     public static void insertionSort(Integer arr[]) {
//         for (Integer i = 1; i < arr.length; i++) {
//             Integer curr = arr[i];
//             Integer prev = i - 1;
//             // finding out the correct position to insert
//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             // insertion
//             arr[prev + 1] = curr;
//         } // void is invalid type of printarr error aaye to samahjh lena curly brackets
//         // gadbad lagaye huye hai
//     }

//     public static void printArr(Integer arr[]) {
//         for (Integer i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();
//     }

//     public static void main(String args[]) {
//         Integer[] arr = {4, 3, 2, 5, 1};
//         // insertionSort(arr);
//         // Arrays.sort(arr);//inbuilt sort//ascending order sorted array
//         // Arrays.sort(arr,1,3);//complexity of inbuilt sort is O(n logn)
//         //   Arrays.sort(arr,Collections.reverseOrder());//works for descending order//it uses comparator internally
//         Arrays.sort(arr, 0, 3, Collections.reverseOrder());
//         printArr(arr);
//     }

// }
