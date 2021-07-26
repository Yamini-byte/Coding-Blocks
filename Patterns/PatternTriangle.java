package PatternsAssignment;

public class PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			1 
//        2 3 2
//      3 4 5 4 3
//    4 5 6 7 6 5 4
		/*work--->
		 * nsp spaces 
		 * nst stars
		 * initial value--->
		 * nsp=n-1;
		 * nst = 1;
		 * updation---->
		 * nsp--;
		 * nst+=2;
		 * */
		int n = 5;
		
		int row=1;
		int nsp = n-1;
		int nst = 1;
		int val1 = 1;
		int val2 = 0;
		while(row<=n) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print("\t");
				csp++;
			}
			int cst = 1;
			val2=val1;
			while(cst<=nst) {
				if(cst == 1 || cst == nst)
					System.out.print(val1+"\t");
				else {
					if(cst<=(int)nst/2+1)
					val2++;
					else val2--;
					System.out.print(val2+"\t");
				}
				cst++;
			}
			
			System.out.println();
			row++;
			val1++;
			nsp--;
			nst+=2;
		}
	}

}
