package practice_codes2;

import java.util.HashSet;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class FindCommonBetween2Arrays {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6,7,8,9};
		int arr2[] = {4,6,9};
		
		HashSet hs = new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			
			hs.add(arr1[i]);
			
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			
			if( hs.contains(arr2[i]))
			{
			System.out.print(" "+arr2[i]);
			}
		}
		
		
		
	}

}
