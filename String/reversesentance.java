package String;

public class reversesentance {
    public static void main(String[] args) {
        String str="my name is khan";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        s=s.trim();
        String[] words=s.split("\\s+");
        String ans="";
        for (int i=words.length-1;i>=0;i--){
            ans=ans+words[i];
            if(i!=0){
                ans=ans+" ";
            }
        }
        return ans;
    }
}

