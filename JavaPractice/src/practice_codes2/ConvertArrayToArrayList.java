package practice_codes2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		
		String colors[] = {"Red","Green","Blue"};
		List list = Arrays.asList(colors);				// method 1
		System.out.println(list);
	
		
		List<String> l = new ArrayList<>();
		Collections.addAll(l, colors);					// method 2
		System.out.println(l);
		
		List <String> li = new ArrayList<>();
		for(String str: colors)
		{
			li.add(str);
		}
		System.out.println(li);

	}

}
