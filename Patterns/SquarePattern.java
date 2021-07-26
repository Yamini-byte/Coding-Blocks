package PatternsAssignment;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1 2 3 4 5 
//		2 2 3 4 5 
//		3 3 3 4 5 
//		4 4 4 4 5 
//		5 5 5 5 5
		/*rows = n
		 * work done-----> nsn numbers
		 * updation ------> row++
		 * new line
		 * 
		 * */
		int n = 5;
		
		int row = 1;
		int first = 1;
		int nsn = 5;
		
		while(row<=n) {
			int csn = 1;
			while(csn<=nsn) {
				if(csn <= first) {
					System.out.print(first+" ");
					csn++;
				}
				else {
					System.out.print(csn+" ");
					csn++;
				}				
			}
			System.out.println();
			row++;
			first++;
		}

	}

}
