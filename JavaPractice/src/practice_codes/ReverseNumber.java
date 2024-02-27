package practice_codes;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		int a = 25025;
		String st = String.valueOf(a);
		StringBuffer sb = new StringBuffer(st);
		System.out.println(sb.reverse());
		StringBuffer sbf = sb.reverse();
		String strr = sbf.toString();
		System.out.println(strr);
		
	}

}
