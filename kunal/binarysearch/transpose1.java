package kunal.binarysearch;

import java.util.Arrays;

public class transpose1 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6}};
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] transpose=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j]=matrix[j][i];
            }
        }
        for (int[] is : transpose) {
            System.out.println(Arrays.toString(is));
        }
        
    }
}
