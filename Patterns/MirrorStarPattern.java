package PatternsAssignment;

public class MirrorStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			  *
//		   *  *  *  
//		*  *  *  *  *  
//		   *  *  *
//		      *
		/*input = 5;
		 * rows = 5;
		 * work done--->
		 * nsp spaces, nst stars
		 * initial values --- >
		 * nsp = n/2 nst=1;
		 * updation---->
		 * nst+=2;
		 * if(row<n/2) nsp--;
		 * else nsp++;
		 * */
		int n=7;
		
		int row = 1;
		int nsp = (int)n/2;
		int nst = 1;
		while(row<=n) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print("\t");
				csp++;
			}
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*\t");
				cst++;
			}
			//updations
			if(row<=(int)n/2) {
				nsp--;
				nst+=2;
			}
			else {
				nsp++;
				nst-=2;
			}
			row++;
			
			System.out.println();
		}

	}

}
