package PatternsAssignment;

public class PatternMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  1           1
//        1 2       2 1  
//        1 2 3   3 2 1
//        1 2 3 4 3 2 1
		/*rows = n = 4;
		 * work done --->
		 * nst star nsp space nst star
		 * initial values-->
		 * rows = 1;
		 * nsp = n+1;
		 * nst = 1;
		 * updation--->
		 * nsp-=2;
		 * 
		 * */
		int n=4;
		int rows = 1;
		int nst = 1;
		//int val = 1;
		int nsp = 2*n-3;
		while(rows<=n) {
			int cst = 1;
			int val = 1;
			while(cst<=nst) {
				System.out.print(val+"\t");
				cst++;
				val++;
			}
			int csp = 1;
			while(csp<=nsp) {
				System.out.print("\t");
				csp++;
			}
			cst = 1;
			//val = 1;
			val--;
			if(rows==n) {
				val--;
			}
			while(cst<=nst) {
				if(cst == n) {
					System.out.print("\t");
				}else {
					System.out.print(val+"\t");
				}
				val--;
				cst++;
			}
			
			System.out.println();
			rows++;
			nst++;
			nsp-=2;
		}

	}

}
