package dataTypesAssignment;

import java.io.*;
import java.util.Scanner;

public class OddEvenSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Sample Input
			2635
			Sample Output
			11
			5
		 * */
		Scanner sc = new Scanner(System.in);
		long i = sc.nextLong();
		long temp = i;
		long count = 0;
		long sumOfEven = 0;
		long sumOfOdd = 0;
		while(temp != 0) {
			count++;
			temp /= 10;
		}
		long j = count;
		while(count!=0) {
			if(count%2 == 0) {
				sumOfEven += i%10;
				count--;
				i /= 10;
			}
			else {
				sumOfOdd += i%10;
				count--;
				i /= 10;
			}
		}
//		int j = 0;
//		temp = i;
//		while(temp!=0) {
//			if(count %2 == 0) {
//				if(j%2 == 0) {
//					sumOfOdd += temp%10;
//					temp /= 10;
//				}
//				else {
//					sumOfEven += temp%10;
//					temp /= 10;
//				}
//				j++;
//			}
//			else {
//				if(j%2 == 0) {
//					sumOfEven += temp%10;
//					temp /= 10;
//				}
//				else {
//					sumOfOdd += temp%10;
//					temp /= 10;
//				}
//				j++;
//			}
//		}
		if(j%2 == 0) {
			System.out.println(sumOfEven);
			System.out.println(sumOfOdd);
		}
		else {
			System.out.println(sumOfOdd);
			System.out.println(sumOfEven);
		}
		
	}

}
