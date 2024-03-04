package practice_codes2;

public class ReverseFromString {

	public static void main(String[] args) {
		
		String str = "RoHit";
		String result = " ";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			result = ch+result;
		}
		
		System.out.println(result);
		

		
		
		

	}
	
	
	
	

}
