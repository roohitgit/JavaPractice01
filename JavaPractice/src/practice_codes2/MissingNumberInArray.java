package practice_codes2;
import java.util.HashSet;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		Integer a[] = {1,2,4,5,6,8,9};
		missingNumbers(a);
		
	}

	private static void missingNumbers(Integer[] a)
	{
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(Integer no : a)
		{
			hs.add(no);
		}
		
		for(int i=1; i<=a.length; i++)
		{
			if(!hs.contains(i))
			{
				System.out.println(i);
			}
		}
		
		
		
		
	}
	
	
	
	
}
