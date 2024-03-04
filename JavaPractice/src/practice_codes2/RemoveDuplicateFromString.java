package practice_codes2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		
		String str = "Sandeep";
		
		System.out.println(removeDuplicate(str));

	}

	
	private static StringBuffer removeDuplicate(String str) {
		Set<Character> set = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			Character c = str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sb.append(c.toString());
			}
		}
		return sb;
		
		
		
	}


	
	
	
	
}
