public class Searchinrotatedarray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(rotatedbinarysearch(arr, target));
    }
    static int rotatedbinarysearch(int[] arr,int target){
        int peak=peakvalue(arr);
        int firsttry=orderagnosticinarysearch(arr, target, 0, peak);
        if(firsttry!=-1){
            return firsttry;
        }
        return orderagnosticinarysearch(arr, target, peak+1, arr.length-1);
    }
    static int peakvalue(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid-1;
            }
        }
        return start;
    }
    public static int orderagnosticinarysearch(int[] arr, int target, int start, int end){
        boolean isasc=arr[start]<arr[end];
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isasc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    

}
