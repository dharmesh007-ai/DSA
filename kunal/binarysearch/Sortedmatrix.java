package kunal.binarysearch;

import java.util.Arrays;

public class Sortedmatrix {
    public static void main(String[] args) {
        int[][] matrix={//array is only sorted in its row OR column
            {2,4,6,8},
            {3,11,14,15},
            {9,12,17,20},
            {21,24,25,29}
        };
        int target=7;
        System.out.println(Arrays.toString(search(matrix,target)));
    }
    static int[] search(int[][] mat,int target){
        int low=0;// lower bound row
        int high=mat[0].length-1;//upperbound column
        while(low<mat.length && high>=0){
            if(mat[low][high]==target){
                return new int[]{low,high};
            }
            if(mat[low][high]>target){
                high--;
            }else{
                low++;
            }
        }
        return new int[]{-1,-1};
    }
}
