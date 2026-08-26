

public class Transpose {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};
        int[][] trans=new int[4][4];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                trans[col][row]=arr[row][col];
            }
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<trans[row].length;col++){
                System.out.print(trans[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
    

