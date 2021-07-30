package stringsAssignment;

import java.util.Scanner;

public class asciiDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Sample Input
		acb
		Sample Output
		a2c-1b
		Explanation
		For the sample case, the Ascii code of a=97 and c=99 ,
		the difference between c and a is 2.Similarly ,
		the Ascii code of b=98 and c=99 and their difference is -1. 
		So the ans is a2c-1b.
		*/
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(ascii(s));
	}
	public static String ascii(String s) {
		String ans ="";
		int i = 0;
		int diff = 0;
		while(i <  s.length()-1) {
			diff = (int)(s.charAt(i+1) - s.charAt(i));
			ans += s.charAt(i);
			ans += diff;
			i++;
		}
		ans += s.charAt(i);
		return ans;
	}
}
