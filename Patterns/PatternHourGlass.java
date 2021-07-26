package PatternsAssignment;

public class PatternHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5 4 3 2 1 0 1 2 3 4 5
		     4 3 2 1 0 1 2 3 4 
		       3 2 1 0 1 2 3 
		       	 2 1 0 1 2 
		           1 0 1 
		             0 
		           1 0 1 
		         2 1 0 1 2 
		       3 2 1 0 1 2 3 
		     4 3 2 1 0 1 2 3 4 
		   5 4 3 2 1 0 1 2 3 4 5
		 *input = 5;
		 *nsp, nst , 0 , nst;
		 *row = 1 --> 2*n+1;
		 *row <= n nsp--; else ++;
		 * updations---->
		 * nst1-- ; nst2--; nsp++;
		 * */
		int n = 5;
		int row = 1;
		int nst1 = n;
		int nsp = 0;
		int nst2 = n;
		while(row <= 2*n +1) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst1 = 1;
			int val1 = nst1;
			while(cst1 <= nst1) {
				System.out.print(val1+" ");
				cst1++;
				val1--;
			}
			System.out.print("0 ");
			int cst2 = 1;
			int val2 = 1;
			while(cst2 <= nst2) {
				System.out.print(val2+" ");
				cst2++;
				val2++;
			}
			
			if(row <= n) {
				nst1--;
				nst2--;
				nsp++;
			}
			else {
				nst1++;
				nst2++;
				nsp--;
			}
			System.out.println();
			row++;
		}

	}

}
