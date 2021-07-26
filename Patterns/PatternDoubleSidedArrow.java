package PatternsAssignment;

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 		1 
//	        2 1   1 2 
//	    3 2 1       1 2 3 
//	4 3 2 1           1 2 3 4 
//	    3 2 1       1 2 3 
//	        2 1   1 2 
//	            1 
		/*row = 6
		 * work done---->
		 * nsp->nst->nsp->nst
		 * initial values--->
		 * nsp1 = n-1; nst = 1 , nsp2=-1;
		 * updations---->
		 * if(row<=n/2) nsp1-=2 & nsp2+=2 & nst++;
		 * */
		int n=7;
		
		int row=1;
		int nsp1 = n-1;
		int nst1 = 1;
		int nst2 = 1;
		int nsp2= -1;
		int val = 1;
		while(row<=n) {
			int csp1 = 1;
			while(csp1<=nsp1) {
				System.out.print("  ");
				csp1++;
			}
			int cst1 = 1;
			int val2 = val-1;
			while(cst1<=nst1) {
				if(cst1 == 1) {
					System.out.print(val+" ");
				}
				else {
					
					System.out.print(val2+" ");
					val2--;
				}
				
				cst1++;
				//val--;
			}
			int csp2 = 1;
			while(csp2<=nsp2) {
				System.out.print("  ");
				csp2++;
			}
			int cst2 = 1;
			val2 = 1;
			//val++;
			while(cst2<=nst2) {
				if(row==1 || row==n) {
					System.out.print(" ");
				}else {
					
					if(cst2 == nst2) {
						System.out.print(val+" ");
					}
					else {
						System.out.print(val2+" ");
						val2++;
					}
				}
				
				cst2++;
				//val--;
			}
			if(row<=n/2) {
				nsp1-=2;
				nsp2+=2;
				nst1++;
				nst2++;
				val++;
			}else {
				nsp1+=2;
				nsp2-=2;
				nst1--;
				nst2--;
				val--;
			}
			System.out.println();
			row++;
			//val++;
			
		}

	}

}
