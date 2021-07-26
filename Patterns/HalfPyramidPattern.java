package PatternsAssignment;

public class HalfPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5
		/*work done---->
		 * nsn numbers
		 * initial value -->
		 * nsn = 1;
		 * rows = n = 5;
		 * updation--->
		 * nsn++;
		 * */
		int n = 10;
		int row = 1;
		int nsn = 1;
		while(row<=n) {
			int csn = 1;
			int val = 1;
			while(csn<=nsn) {
				System.out.print(val);
				val++;
				csn++;
			}
			
			System.out.println();
			row++;
			nsn++;
		}

	}

}
