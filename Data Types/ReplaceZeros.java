package dataTypesAssignment;

import java.util.*;

public class ReplaceZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to input a number N and replace 
		 *all the zeros in the number by C and display the number and if zero are not there display "Zero is not present".
		 *45298
		 *6op- zeros not present
		 * */
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long c = sc.nextInt();
		long temp = n;
		int count = 0;
		int flag = 0;
		while(temp!=0) {
			count++;
			temp = temp/10;
		}
		temp = n;
		long[] arr = new long[count];
		for(int i=0;i<count;i++) {
			arr[i] = temp%10;
			
			temp = temp/10;
		}
		int j = 0;
		while(j<count) {
			if(arr[j] == 0) {
				flag++;
				break;
			}
			j++;
		}
		if(flag == 0) {
			System.out.println("Zero is not present");
		}
		else {
			for(int i=0;i<count;i++) {
				if(arr[i] == 0) {
					arr[i] = c;
				}
			}
			long number = 0;
			for(int i=count-1;i>=0;i--) {
				number = number*10 + arr[i];
			}
			System.out.println(number);
		}
		
	}

}
