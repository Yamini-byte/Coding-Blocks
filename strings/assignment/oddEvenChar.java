package stringsAssignment;

import java.util.Scanner;

public class oddEvenChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Sample Input
		abcg
		Sample Output
		badf
		*/
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(replace(s));

	}
	public static String replace(String s) {
		String ans = "";
		int i=0;
		while(i < s.length()) {
			if(i%2 == 0) {
				ans += (char)((int)s.charAt(i) + 1);
			}
			else {
				ans += (char)((int)s.charAt(i) - 1);
			}
			i++;
		}
		return ans;
	}

}
