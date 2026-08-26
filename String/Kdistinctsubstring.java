public class Kdistinctsubstring {
    public static void main(String[] args) {
        String str="aabcdeaaa";
        int k=2;
        System.out.println(ksubstring(str, k));
    }
    static int ksubstring(String str, int k){
        int[] arr=new int[26];
        int maxlen=0;
        int n=str.length();
        int left=0;
        int right=0;
        int dis=0;
        while(right<n){
            int c=str.charAt(right)-97;
            if(arr[c]==0){
                arr[c]++;
                dis++;
                right++;
            }else{
                arr[c]++;
                right++;
            }
            
            if(dis>k){
                arr[str.charAt(left)-97]--;
                left++;
                if(arr[str.charAt(left)-97]==0){
                    dis--;
                }
            }
            if(right-left>maxlen){
                maxlen=right-left;
            }
        }
        return maxlen;
    }
}
