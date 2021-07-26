package PatternsAssignment;

public class HollowRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		    *****
		   *   *
		  *   *
		 *   *
		*****
		 * work--->
		 * nsp , nst
		 * initial values -- > nsp = n-1, nst = 5;
		 * updations--->
		 * nsp--; 
		 * */
		int n = 7;
		int row = 1;
		int nst = n, nsp = n-1;
		while(row <= n) {
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while(cst <= nst) {
				if(row == 1 || row == n) {
					System.out.print("*");
				}else{
					if(cst == 1 || cst == nst) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}					
				}				
				cst++;
			}
			nsp--;
			row++;
			System.out.println();
		}
	}

}
