package PatternsAssignment;

public class DownwardTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		* * * * * * 
//		 * * * * * 
//		  * * * * 
//		   * * * 
//		    * * 
//		     * 
		/*nsp spaces nst stars
		 * intial rows = n
		 * work--->
		 * nsp spaces
		 * nst stars
		 * initial values---->
		 * nst = n;
		 * nsp = 0;
		 * updation---->
		 * nsp++;
		 * nst--;
		 * */
		
		int n = 6;
		
		int row = 1;
		int nsp = 0;
		int nst = 2*n-1;
		while(row <= n) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 1;
			while(cst<=nst) {
				if(cst%2==0) {
					System.out.print("  ");
				}
				else
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			row++;
			nsp++;
			nst-=2;
		}

	}

}
