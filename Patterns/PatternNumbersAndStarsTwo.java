package PatternsAssignment;

public class PatternNumbersAndStarsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 1******
//		 12*****
//		 123****
//		 1234***
//		 12345**
//		 123456*
//		 1234567
		/*rows = 7
		 * work done---->
		 * nsn numbers, nst stars
		 * initial values--->
		 * nsn = 1 nst = n-1
		 * updation---->
		 * nsn ++ ; nst--;
		 * 
		 * */
		int n = 8;
		
		int row = 1;
		int nsn = 1;
		int nst = n-1;
		while(row<=n) {
			int csn = 1;
			int val = 1;
			while(csn<=nsn) {
				System.out.print(val);
				csn++;
				val++;
			}
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			System.out.println();
			row++;
			nsn++;
			nst--;
		}

	}

}
