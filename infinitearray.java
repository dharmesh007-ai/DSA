public class infinitearray {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,10,11,15,23,25,28,31,35,38,40,45,50};
        int target=5;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
            int newstart=end+1;
            end = end + (end-start+1)*2;
            start=newstart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
