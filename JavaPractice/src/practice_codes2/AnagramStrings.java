package practice_codes2;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hoell";
		
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		Boolean result = Arrays.equals(c1, c2);
		
		if(result)
		{
			System.out.println("YES, it is an Anagram");
		}
		else
		{
			System.out.println("NO, it is not an Anagram");
		}

	}

}
