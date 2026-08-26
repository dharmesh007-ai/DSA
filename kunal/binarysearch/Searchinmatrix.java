package kunal.binarysearch;

import java.util.Arrays;

public class Searchinmatrix {
    public static void main(String[] args) {
        int[][] matrix={
                    {21,25,73,57},
                    {46,28,39,93},
                    {74,98,64,26},
                    {47,77,92,74}
                };
        int target=77;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] search(int[][] mat,int target){
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if(mat[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
