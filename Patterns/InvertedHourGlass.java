package PatternsAssignment;

public class InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		5                   5 
		5 4               4 5 
		5 4 3           3 4 5 
		5 4 3 2       2 3 4 5 
		5 4 3 2 1   1 2 3 4 5 
		5 4 3 2 1 0 1 2 3 4 5 
		5 4 3 2 1   1 2 3 4 5 
		5 4 3 2       2 3 4 5 
		5 4 3           3 4 5 
		5 4               4 5 
		5                   5 
		 * work--->
		 * nst , nsp , nst
		 * nsp= 2*n-1
		 * updations---> row<= n => nsp -=2 else opp.
		 * nst1++, nst2++
		 * */
		int n = 9;
		int row = 1;
		
		int nst1 = 1, nst2 = 1, nsp = 2*n-1;
		while(row <= 2*n+1) {
			int val = n;
			int cst1 = 1;
			if(row == n+1) {
				cst1 = 2;
			}
			while(cst1 <= nst1) {
				System.out.print(val+" ");
				cst1++;
				val--;
			}
			int csp = 1;
			while(csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			if(row == n+1) {
				System.out.print("0 ");
			}
			int cst2 = 1;
			if(row == n+1) {
				cst2 = 2;
			}
			val++;
			while(cst2 <= nst2) {
				System.out.print(val+" ");
				cst2++;
				val++;
			}
			if(row<=n) {
				nsp -= 2;
				nst1++;
				nst2++;
			}else {
				nsp += 2;
				nst1--;
				nst2--;
			}
			row++;
			System.out.println();
		}
	}

}
