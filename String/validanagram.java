package String;
import java.util.*;
public class validanagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagraam";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[]  fr=freq(s);
        for(int i=0;i<t.length();i++){
            int b=(int)(t.charAt(i))-97;
            fr[b]--;
        }
        for(int i=0;i<fr.length;i++){
            if(fr[i]!=0){
                return false;
            }
        }
        return true;
    }
    static int[] freq(String s){
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            int a=(int)s.charAt(i);
            arr[a-97]++;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

