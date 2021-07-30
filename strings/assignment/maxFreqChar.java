package stringsAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class maxFreqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(frequency(s));
		
	}
	public static char frequency(String s) {
		int[] freq = new int[256];
		int len = s.length();
        for (int i=0; i<len; i++)
            freq[s.charAt(i)]++;
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < freq[s.charAt(i)]) {
                max = freq[s.charAt(i)];
                result = s.charAt(i);
            }
        }
      
        return result;
	}
	
}
