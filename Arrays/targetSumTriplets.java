package arraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class targetSumTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sample Input
			9
			5 7 9 1 2 4 6 8 3
			10
			Sample Output
			1, 2 and 7
			1, 3 and 6
			1, 4 and 5
			2, 3 and 5
		 * 
		 * */
//		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		
		int i = 0;
		Arrays.sort(arr);
		for(i=0;i<arr.length;i++) {
			int j = target - arr[i];
			int start = i+1;
			int end = arr.length-1;
			while(start < end) {
				if(arr[start] + arr[end] == j) {
					System.out.println(arr[i]+", "+arr[start]+" and "+ arr[end]);
					start++;
					end--;
				}
				else if(arr[start] + arr[end] > j) {
					end--;
				}
				else {
					start++;
				}
			}
		}
		
	}
}
