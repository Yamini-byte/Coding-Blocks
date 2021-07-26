package dataTypesAssignment;

import java.util.*;

public class DecimaltoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int mul = 1 ;
		while(n != 0) {
			//taking mod in octal
			int rem = n%8;
			ans = mul*rem + ans;
			n = n/8;
			mul = mul*10;
		}
		System.out.println(ans);
	}

}
