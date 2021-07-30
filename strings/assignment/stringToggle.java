package stringsAssignment;

import java.util.Scanner;

public class stringToggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(toggle(s));
	}
	public static String toggle(String s) {
		int i = 0;
		String ans= "";
		for(i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				ans += Character.toUpperCase(s.charAt(i));
			}
			else {
				ans += Character.toLowerCase(s.charAt(i));
			}
		}
		return ans;
	}
}
