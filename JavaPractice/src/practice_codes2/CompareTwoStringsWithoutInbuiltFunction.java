package practice_codes2;

public class CompareTwoStringsWithoutInbuiltFunction {

	public static void main(String[] args) {
		String str1 = "RooHit";
		String str2 = "RooHit";
		Boolean isCompare = false;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				isCompare = false;
			
			break;
			}
			isCompare = true;
		}
	
		System.out.println(isCompare);
		}
		

	}

