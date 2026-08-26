public class mountainarr {
    public static void main(String[] args) {
        int[] arr={5,1,3};
        int target=5;
        System.out.println(Search1(arr,target));
        
    }
    public static int Search1(int[] arr,int target){
        int peak=peakvalue(arr);
        int ans=orderagnosticBS(arr, target, 0, peak);
        if(ans!=-1){
            return ans;
        }else{
            return orderagnosticBS(arr, target, peak+1, arr.length-1);
        }
    }
    public static int peakvalue(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
    public static int orderagnosticBS(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }if(arr[mid]>target){
                    end=mid-1;
            }else{
                start=mid+1;
            }
            
        }
        return -1;
    }
}
