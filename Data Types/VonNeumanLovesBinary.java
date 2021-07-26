package dataTypesAssignment;

import java.util.*;

public class VonNeumanLovesBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(--testCases >= 0) {
			int n = sc.nextInt();
			int ans = 0;
			int mul = 1;
			while(n!=0) {
				//conversion to decimal i.e., 10
				int rem = n%10;
				ans = mul*rem + ans;
				//divide by number to be converted to -> decimal -> 10
				n = n/10;
				//multiply by original base
				mul = mul*2;
				
			}
			System.out.println(ans);
		}
		

	}

}
