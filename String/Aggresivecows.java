import java.util.*;
public class Aggresivecows {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of stalls =");
        int n=sc.nextInt();
        System.out.println("enter no. of cows =");
        int c=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter stall number =");
        for(int i=0;i<arr.length;i++){
            System.out.print(i+" :");
            arr[i]=sc.nextInt();
        }
        System.out.println(aggressiveCows(arr,c));
    }
    public static int aggressiveCows(int[] stalls, int k) {
        int low=0;
        int high=stalls.length-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high+low)/2;
            if(ispossible(mid,stalls,k)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid+1;
            }
        }
        return ans;
    }
    static Boolean ispossible(int des, int[] stall, int nofcow){
        int cow=0;
        int pos=stall[0];
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=des){
                cow++;
                pos=stall[i];
            }
            if(cow==nofcow){
                return true;
            }
        }
        return false;
    }
}

