import java.util.*;

public class diagonalsum {
    public static int printDiagonalSum(int matrix[][]) {
        int sum = 0;
        // brute force approach hai ye time complexity of this function O(n2)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {// primary diagonal conditions
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) {//secondary diagonal condition
        // sum += matrix[i][j];
        // }
        // }
        for (int i = 0; i < matrix.length; i++) {// time complexity O(n)
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - i - 1];
           // this question ask in many big coampanies like google microsoft etc
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(printDiagonalSum(matrix));
    }
}
