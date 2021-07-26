package PatternsAssignment;

public class ManmohanLovesPatternsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1
//		11
//		111
//		1001
//		11111
//		100001
		// for every odd number of row, print all 1s
		// for every even number of row print first and last 1 and rest 0
		/*rows = n
		 * work done--->
		 * nsn numbers
		 * if(row%2)==1 s.o.p 1
		 * if(row%2==0) (if csn ==1 or csn==nsn ) s.o.p 1 else s.o.p 0
		 * updation--->
		 * row++;
		 * nsn++;*/
		int n = 6;
		
		int row=1;
		int nsn=1;
		int val1 = 1;
		int val2 = 0;
		while(row<= n) {
			int csn = 1;
			while(csn<=nsn) {
				if(row%2==1) {
					System.out.print(val1 + " ");
				}
				else {
					if(csn == 1 || csn == nsn) {
						System.out.print(val1 + " ");
					}
					else {
						System.out.print(val2 + " ");
					}
				}
				csn++;
			}
			System.out.println();
			row++;
			nsn++;
		}
		
	}

}
