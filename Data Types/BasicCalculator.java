package dataTypesAssignment;

import java.util.*;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program that works as a simple calculator.

			1.It reads a character (ch)
			2.If ch is among '+', '-', '*', '/' or '%' it furthur takes two numbers (N1 and N2 as input). It then performs appropriate appropriate operation between numbers and print the number.
			3.If ch is 'X' or 'x', the program terminates.
			4.If ch is any other character, the program should print 'Invalid operation. Try again.' and seek inputs again (starting from character).


			Write code to achieve above functionality.
			* INPUT--->
			*   *
				1 
				2 
				/ 
				4 
				2 
				+ 
				3 
				2 
				; 
				X
				OUTPUT--->
					2 
					2 
					5 
					Invalid operation. Try again.
		 * */
		boolean a = true;
		Scanner sc = new Scanner(System.in);
		while(a == true) {
			
			char ch = sc.next().charAt(0);
			
			if(ch == '+') {
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println(x+y);
			}
			else if(ch == '-') {
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println(x-y);
			}
			else if(ch == '*') {
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println(x*y);
			}
			else if(ch == '/') {
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println(x/y);
			}
			else if(ch == '%') {
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println(x%y);
			}
			else if(ch == 'x' || ch == 'X') {
				break;
			}
			else {
				System.out.println("Invalid operation. Try again.");
				//a = false;
			}
			//sc.close();
		}
		
	}

}
