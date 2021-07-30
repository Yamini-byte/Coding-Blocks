package stringsAssignment;

import java.util.Scanner;

public class stringCompressionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					if(count > 1)
						ans += count;
					count = 1;
				}
				else {
					count++;
				}
				
			}
			if(i == s.length()-1) {
				ans += s.charAt(i);
				if(count > 1)
					ans += count;
			}
			i++;
		}
		return ans;
	}

}
