package practice_codes2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseElementOfArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int low=0,high=a.length-1,temp;
		
		while(low<high)
		{
			temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;
		}
		
		for(int n:a)
		{
			System.out.print(n+" ");
		}

	}

}
