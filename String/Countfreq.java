package String;

import java.util.Arrays;

public class Countfreq {
    public static void main(String[] args) {
        String str="hello";
        int ans=(int)(str.charAt(0));
        int[] a=frequency(str);
        //System.out.println(Arrays.toString(frequency(str)));
        for (int i=0 ;i<a.length;i++){
            if(a[i]>0){
                char b=(char)(i+97);
                System.out.println(b+" = "+ a[i]);
            }
        }

    }
    static int[] frequency(String str){
        int[] arr=new int[26];
        for (int i=0;i<str.length();i++){
            int ans=(int)(str.charAt(i));
            arr[ans-97]++;
        }
        return arr;
    }
}
