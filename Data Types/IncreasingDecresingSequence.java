package dataTypesAssignment;

import java.io.*;

public class IncreasingDecresingSequence {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*first sequence should be strictly decreasing
		 * second sequence should be strictly increasing*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int flag = 0;
		long num = Long.parseLong(br.readLine());
		for(int i=1;i<testCases;i++) {
			long next = Long.parseLong(br.readLine());
			if(next > num) {
				flag = 1;
			}
			else {
				if(flag == 1) {
					System.out.println("false");
					flag = 0;
					break;
				}
			}
			num = next;
		}
		if(flag == 1) {
			System.out.println("true");
		}
	}
}
