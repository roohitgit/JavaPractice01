package practice_codes2;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsInArrayInAscDesc {

	public static void main(String[] args) {
		
		
		String str[] = {"b","a","z","c","t"};
		
		System.out.println("Before Sorting ");
		for(String string:str)
		{
			System.out.print(string+" ");
		}
		
		System.out.println();
		Arrays.sort(str);
		System.out.println("After Sorting in Ascending "+" ");
		for(String string:str)
		{
			System.out.print(string+" ");
		}
		
		System.out.println();
		Arrays.sort(str, Collections.reverseOrder());
		System.out.println("After Sorting in Descending "+" ");
		for(String string:str)
		{
			System.out.print(string+" ");
		}
		
	}

}
