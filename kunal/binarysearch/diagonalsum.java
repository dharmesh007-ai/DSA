package kunal.binarysearch;

public class diagonalsum {
    public static void main(String[] args) {
        int[][] mat={
            {5}
            };
        int n=mat.length;
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][i];
            sum+=mat[i][n-i-1];
        }
        if(mat.length%2==1){
            sum=sum-mat[n/2][n/2];
        }
        System.out.println(sum);
    }
}
