package lecStrings1;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abd";
		System.out.println(rev(s));
		

	}
	public static String rev(String s) {
		String s1 = "";
		int i = s.length()-1;
		while(i >=0) {
			s1 += s.charAt(i);
			i--;
		}
		
		return s1;
	}
}
