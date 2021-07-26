package PatternsAssignment;

public class SquarePyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = 1;
		//int val = 1;
		//int val2 = 1;
		int temp=0;
		while(row <= n) {
			int cst = 1;
			int val = 1;
			while(cst <= nst) {
				
				System.out.print((int)Math.pow(val,2)+" ");
				val++;
				
				cst++;
			}
			System.out.println();
			row++;
			nst++;
			
		}
	}

}
