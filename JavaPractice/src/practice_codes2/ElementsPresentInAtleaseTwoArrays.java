package practice_codes2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class ElementsPresentInAtleaseTwoArrays {

	public static void main(String[] args) {
	
		Integer a1[] = {1,2,3,9,8,7};
		Integer a2[] = {4,1,2,10,15};
		Integer a3[] = {5,1,2,4,10};
		
		HashSet<Integer> hs = new HashSet<>();
		List l1 = Arrays.asList(a1);
		List l2 = Arrays.asList(a2);
		List l3 = Arrays.asList(a3);
		hs.addAll(l1);
		hs.addAll(l2);
		hs.addAll(l3);
		
		List finalList = new ArrayList();
		
		for(int number : hs)
		{
			if(
					(l1.contains(number) && l2.contains(number)) ||
					(l2.contains(number) && l3.contains(number)) ||
					(l1.contains(number) && l3.contains(number))
					)
			{
				
				finalList.add(number);
			}
			}

			System.out.println(finalList);
		
		}
	}


