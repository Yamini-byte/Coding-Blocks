package stringsAssignment;

import java.util.*;

public class deleteDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	Sample Input
			aabccba
			Sample Output
			abcba
			Explanation
			For the given example, "aabccba", Consecutive Occurrence of a is 2, b is 1, and c is 2.
			
			After removing all of the consecutive occurences, the Final ans will be : - "abcba".
		 * */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(removeduplicate(s));
		
	}
	public static String removeduplicate(String s) {
		String ans ="";
		int i=0;
		while(i < s.length()-1) {
			if(s.charAt(i+1) != s.charAt(i)) {
				ans += s.charAt(i);
			}
			i++;
		}
		ans += s.charAt(s.length()-1);
		return ans;
	}
}
