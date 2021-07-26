package PatternsAssignment;

public class HollowDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 * * * * *
//	     * *   * *
//	     *       *
//	     * *   * *
//	     * * * * *
		/*input = 5;
		 * row = 1;
		 * nst1 nsp nst2;
		 * ns1 = 3, nst2 = 3, nsp = -1;
		 * updations--->
		 * if(row <= n/2){nst--; nsp+=2} else opp.
		 * */
		int n = 7;
		int row = 1;
		int nst1 = n-2;
		int nsp = -1;
		int nst2 = n-2;
		while(row <= n) {
			int cst1 = 1;
			while(cst1 <= nst1) {
				System.out.print("*\t");
				cst1++;
			}
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			int cst2 = 1;
			while(cst2 <= nst2) {
				if((row == 1 && cst2 == nst2)|| (row == n && cst2 == nst2)) {
					System.out.print("\t");
				}else {
					System.out.print("*\t");
				}
				
				cst2++;
			}
			//updations--->
			if(row <= (n/2)) {
				nst1--;
				nst2--;
				nsp+=2;
			}
			else {
				nst1++;
				nst2++;
				nsp-=2;
			}
			row++;
			System.out.println();
		}

	}

}
