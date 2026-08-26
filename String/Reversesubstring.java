package String;

public class Reversesubstring {
    public static void main(String[] args) {
        String str="coding";
        substring(str);
    }
    static void substring(String str){
        for(int len=1;len<=str.length();len++){
            for(int j=len;j<=str.length();j++){
                String i= len - j;
                System.out.println(i);
            }
        }
    }
}
