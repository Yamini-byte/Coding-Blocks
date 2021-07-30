package stringsAssignment;

import java.util.*;

public class canYouReadThis {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		canyou(s);
	}
	public static void canyou(String s) {
		ArrayList<String> ar = new ArrayList<>();
		String ans = "";
		int i = 0;
		while(i < s.length()) {
			ans += s.charAt(i);
			if(i == s.length()-1) {
				ar.add(ans);
				ans = "";
			}
			else if(Character.isUpperCase(s.charAt(i+1)) == true) {
				ar.add(ans);
				ans = "";
			}
			
			i++;
		}
		for(String si : ar) {
			System.out.println(si);
		}
	}
}
