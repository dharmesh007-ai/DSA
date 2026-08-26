package String;

public class Pallindrome {
    public static void main(String[] args) {
        String str="naman";
        String name="naan";
        System.out.println(str+" is :"+ispallindrom(str));
        System.out.println(name+" is :"+ispallindrom(name));  
    }
    static Boolean ispallindrom(String str){
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
