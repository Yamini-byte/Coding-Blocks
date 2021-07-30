package stringsAssignment;

import java.util.Scanner;

public class countPalindromeSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 		Sample Input
				abc
				Sample Output
				3
				Explanation
				For the given sample case , the palindromic substrings of the string abc are "a","b" and "c".So, the ans is 3.
		 * 
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for(int i=0;i<s.length();i++) {
			for(int j = i+1;j<=s.length();j++) {
				if(sub(s.substring(i,j))) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
	public static boolean sub(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i<=j) {
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
