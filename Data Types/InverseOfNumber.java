package dataTypesAssignment;
import java.util.*;
public class InverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int place = 1;
		while(n!=0) {
			int rem = n%10;
			ans += place * Math.pow(10,rem-1);
			n = n/10;
			place+=1;
		}
		System.out.println(ans);
	}

}
