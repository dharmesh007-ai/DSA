package String;

import java.util.*;
public class Playingwithgoodstring {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        int max = 0 ;
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++){
			char ch = str.charAt(i);
			if(isVowel(ch)){
				count++;
			}else {
				max = Math.max(count , max);
				count = 0;
			}
		}
		max = Math.max(count , max);
		System.out.print(max);
    }
	public static boolean isVowel(char ch){
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
			return true;
		} else {
			return false;
		}
	}
}
