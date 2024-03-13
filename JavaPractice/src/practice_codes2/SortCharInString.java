package practice_codes2;

import java.util.Arrays;

public class SortCharInString {

	public static void main(String[] args) {
	
		
		String str = "fghijabc";
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		//System.out.print(ch);
		String sortedStr = new String (ch);
		System.out.println(sortedStr);
		

	}

}
