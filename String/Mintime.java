import java.util.*;
public class Mintime {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int high=0;
        int low=0;
        for(int i=0;i<n;i++){
            high=high+arr[i];
            if(arr[i]>low){
                low=arr[i];
            }
        }
        int ans=0;
        int minans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(istrue(arr, k, mid)){
                ans=mid;
                high=mid-1;
                if(ans<minans){
                    minans=ans;
                }
            }else{
                low=mid+1;
            }
        }
        System.out.println(minans);
        
    }
    static Boolean istrue(int[] board,int k,int time){
        int painter=1;
        int currtime=0;
        for (int i : board) {
            if(i>time){
                return false;
            }
            if(currtime+i>time){
                painter++;
                currtime=i;
                if(painter>k){
                    return false;
                }
            }else{
            currtime+=i;
            }
        }
        return true;
    }
}