public class RotatedBSwithPivot {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search1(arr, target));
    }
    static int search1(int[] arr,int target){
        int pi=pivot(arr);
        if(pi==-1){
            return binarysearch(arr, target, 0, arr.length-1);
        }
        if(arr[pi]==target){
            return pi;
        }
        if(target>=arr[0]){
            return binarysearch(arr, target, 0, pi-1);
        }
        return binarysearch(arr, target, pi+1, arr.length-1);   
    }
    static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
