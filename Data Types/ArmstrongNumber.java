package dataTypesAssignment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*to check if the given number as input is an armstrong number or not
		 * Numbers are armstrong if it is equal to sum of each digit raised to the power of number of digits.
		 * */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		while(temp != 0) {
			count++;
			temp /= 10;
		}
		temp = num;
		int sum = 0;
		while(temp != 0) {
			sum += Math.pow((temp%10),count);
			temp /= 10;
		}
		if(sum == num) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
