public class Maxsubarray {
    public static void main(String[] args) {
        int[] arr={6,4,9,2,8,1,3};
        int k=3;
        System.out.println(maxofsubarray(arr,k));
    }
    static int maxofsubarray(int[] arr,int k){
        int sum=0;
        int ans=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        ans=sum;
        int si=0;
        for(int ei=k;ei<arr.length-1;ei++){
            sum+=arr[ei];
            sum-=arr[si];
            ans=Math.max(ans, sum);
        }
        return ans;
    }
}
