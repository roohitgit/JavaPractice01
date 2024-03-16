package practice_codes2;

public class CompareStringWithoutInbuiltFunction {

	public static void main(String[] args) {
		
		String str1 = "RooHit";
		String str2 = "RooHit";
		Boolean result = null;
		
		for(int i=0; i<str1.length(); i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				result= false;
				break;
			}
			result= true;
		}
		
		System.out.println("both strings are equal = "+result);
	}

}
