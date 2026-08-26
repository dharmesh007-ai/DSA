public class Split {
    public static void main(String[] args) {
        String str="123.321.4431.431";
        String arr[]=str.split("\\.");
        String m="";
        for (int i = 0; i < arr.length; i++) {
            String temp=arr[i]+"[.]";
        }
    }
}
