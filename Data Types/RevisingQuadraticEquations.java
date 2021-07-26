package dataTypesAssignment;

import java.util.Scanner;

public class RevisingQuadraticEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given coefficients of a quadratic equation , you need to print the nature of the roots (Real and Distinct , Real and Equal or Imaginary) and the roots.
			If Real and Distinct , print the roots in increasing order.
			If Real and Equal , print the same repeating root twice
			If Imaginary , no need to print the roots.
			
			Note : Print only the integer part of the roots.
			Constraints
			-100 <= a, b, c <= 100
			
			Output Format
			Output contains one/two lines. First line contains nature of the roots .The next line contains roots(in non-decreasing order) separated by a space if they exist. If roots are imaginary do not print the roots. Output the integer values for the roots.
			
			Sample Input
			1 -11 28
			Sample Output
			Real and Distinct
			4 7
			Explanation
			The input corresponds to equation ax^2 + bx + c = 0. Roots = (-b + sqrt(b^2 - 4ac))/2a , (-b - sqrt(b^2 - 4ac))/2a
			* */
		String s1 = "Real and Distinct";
		String s2 = "Real and Equal";
		String s3 = "Imaginary";
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = discriminant(a,b,c);
		if(d < 0) {
			System.out.println(s3);
		}
		else {
			int root1 = (int)((-b + Math.sqrt(d))/(2*a));
			
			if(d == 0) {
				System.out.println(s2);
				System.out.print(root1 + " " + root1);
			}
			else {
				int root2 = (int)((-b - Math.sqrt(d))/(2*a));
				System.out.println(s1);
				if(root1 < root2)
				System.out.print(root1 + " " + root2);
				else
				System.out.println(root2 + " " + root1);
			}
		}
		
	}
	public static int discriminant(int x, int y , int z) {
		return (int) (Math.pow(y, 2)-(4*x*z));
	}
}
