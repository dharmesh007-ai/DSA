public class Robotmovement {
    public static void main(String[] args) {
        String str="UUUURRRR";
        System.out.println(judgeCircle(str));
    }
    public static boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                x++;
            }else if(moves.charAt(i)=='D'){
                x--;
            }else if(moves.charAt(i)=='R'){
                y++;
            }else{
                y--;
            }
        }
        System.out.println(x+","+y);
        return x==0 && y==0;
    }
}

