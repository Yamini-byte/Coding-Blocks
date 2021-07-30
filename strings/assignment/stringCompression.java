package stringsAssignment;

import java.util.Scanner;

public class stringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Take as input S, a string. 
		 * Write a function that does basic string compression. 
		 * Print the value returned. 
		 * E.g. for input “aaabbccds” print out a3b2c2d1s1.

			Input Format
			A single String S
			
			Constraints
			1 < = length of String < = 1000
			
			Output Format----------
			The compressed String.
			
			Sample Input---------------
			aaabbccds
			Sample Output-------------
			a3b2c2d1s1
			Explanation-----------
			In the given sample test case 
			'a' is repeated 3 times consecutively, 
			'b' is repeated twice, 
			'c' is repeated twice and 
			'd and 's' occurred only once.
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(compressor(s));
	}
	public static String compressor(String s) {
		String ans ="";
		int i = 0;
		int count = 1;
		while(i <  s.length()) {
			if(i+1 < s.length()){
				if(s.charAt(i+1) != s.charAt(i)) {
					ans += s.charAt(i);
					ans += count;
					count = 1;
				}
				else {
					count++;
				}
				
			}
			if(i == s.length()-1) {
				ans += s.charAt(i);
				ans += count;
			}
			i++;
		}
		return ans;
	}
}
