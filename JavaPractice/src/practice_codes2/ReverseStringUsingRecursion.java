package practice_codes2;

public class ReverseStringUsingRecursion {
	
	public static void main(String[] args) {

		String s = "RooHit";
		System.out.println(reverse(s));

	}
	
	private static String reverse(String s)
	{
		
		
		if(s==null || s.length()<=1)
		{
			return s;
		}
		
		return reverse(s.substring(1))+s.charAt(0);
		
	}

}
