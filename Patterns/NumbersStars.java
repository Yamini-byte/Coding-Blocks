package PatternsAssignment;

public class NumbersStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1 2 3 4 5
//		1 2 3 4 * 
//		1 2 3 * * *
//		1 2 * * * * *
//		1 * * * * * * *
		/*
		 * rows = 5
		 * nsn numbers
		 * nst stars
		 * work ---> nsn numbers
		 * nst stars
		 * initial values
		 * nsn = n and nst = -1
		 * updation---->
		 * nsn-- nst++*/
		int n=5;
		
		int row = 1;
		int nsn = n;
		int nst=-1;
		while(row<=n) {
			int csn = 1;
			int val = 1;
			while(csn <= nsn) {
				System.out.print(val + " ");
				val++;
				csn++;
			}
			int cst = 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			row++;
			nsn--;
			nst+=2;
		}

	}

}
