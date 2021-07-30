package lecStrings1;

import java.util.Scanner;

public class checkPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(isPalin(s));
	}
	public static boolean isPalin(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i <= j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}
}
