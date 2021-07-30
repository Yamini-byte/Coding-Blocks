package lecStrings1;

public class reverseStringByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The sky is blue
		 * blue is sky The
		 * */
		String s = "The sky is blue";
		System.out.println(reverse(s));
	}
	public static String reverse(String s) {
		String s1 ="";
		int i=0;
		while(s.length() != 0) {
			i = s.lastIndexOf(' ');
			s1 += s.substring(i+1) + " ";
			if(i < 0) {
				i = 0;
			}
			s = s.substring(0,i);
		}
		
		return s1;
	}
}
