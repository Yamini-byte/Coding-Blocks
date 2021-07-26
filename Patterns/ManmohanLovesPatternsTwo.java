package PatternsAssignment;

public class ManmohanLovesPatternsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1
//		11
//		202
//		3003
//		40004
		/*input = 5;
		 * rows = 5
		 * work done--->
		 * nsn numbers
		 * initial value--->
		 * nsn = 1;
		 * updation--->
		 * nsn++;
		 * */
		int n = 6;
		
		int row = 1;
		int nsn = 1;
		int val = 1;
		while(row<=n) {
			int csn = 1;
			while(csn <= nsn) {
				if(row == 1) {
					System.out.print("1");
				}
				else {
					if(csn == 1 || csn ==nsn)
						System.out.print(val-1);
					else
						System.out.print("0");
				}
				csn++;
			}
			
			System.out.println();
			row++;
			val++;
			nsn++;
		}

	}

}
