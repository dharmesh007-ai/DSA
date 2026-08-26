package kunal.binarysearch;

import java.util.Arrays;

public class Completlysortedmatrix {//we apply binary search as whole matrix is sorted
    public static void main(String[] args) {
        int[][] matrix={//array is sorted in row and column
            {2,4,6,8},
            {9,11,14,15},
            {16,17,18,20},
            {21,24,25,29}
        };
        int target=200;
        System.out.println(Arrays.toString(search(matrix,target)));
    }

    static int[] search(int[][] mat,int target){
        int r=mat.length;//count of total rows
        int c=mat[0].length;// total column
        if(r==1){//if matrix has only 1 row
            return binarys(mat,0,0,c-1,target);
        }
        //run loop till we are left with only 2 rows.... the rows where target cannot lie are eliminated
        int rstart=0;
        int rend=r-1;
        int midcol=c/2;
        while(rstart<(rend-1)){
            int mid=rstart+(rend-rstart)/2;
            if(mat[mid][midcol]==target){
                return new int[]{mid,midcol};
            }
            if(mat[mid][midcol]<target){
                rstart=mid;
            }else{
                rend=mid;
            }
        }
        //we are left with only to rows 
        //check if target lies in middle column
        if(mat[rstart][midcol]==target){
            return new int[]{rstart,midcol};
        }
        if(mat[rstart+1][midcol]==target){
            return new int[]{rstart+1,midcol};
        }

        // now we search in the 4 parts around the mid column
        //search in part 1
        if(target<=mat[rstart][midcol-1]){
            return binarys(mat,rstart,0,midcol-1,target);
        }
        //search in part 2
        if(target>mat[rstart][midcol+1] && target<=mat[rstart][c-1]){
            return binarys(mat,rstart,midcol+1,c-1,target);
        }
        //search in part 3
        if(target<=mat[rstart+1][midcol-1]){
            return binarys(mat,rstart+1,0,midcol-1,target);
        }else{//search in part 4
            return binarys(mat,rstart+1,midcol+1,c-1,target);
        }
    }
    static int[] binarys(int[][] mat, int rowno,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mat[rowno][mid]==target){
                return new int[]{rowno,mid};
            }
            if(mat[rowno][mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
