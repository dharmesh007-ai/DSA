import java.util.*;
public class Substring {
    public static void main(String[] args) {
        String str="coding";
        //System.out.println(str.substring(0, 1));
        substringprint(str);
    }
    static void substringprint(String str){
        for(int i=0;i<str.length();i++){ //
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}
