package practice_codes2;

import practice_codes.DeleteArrayByItemName;

public class MoveAllNegativeToEnd {

	public static void main(String[] args) {
		
		int a[] = {-1,3,4,-5,-6,2,-9,1,1};
		int b[] = new int[a.length];
		
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				b[j]=a[i];
				j++;
			}
		} 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				b[j]=a[i];
				j++;
			}
		}
		
		for(int c:b)
		{
		System.out.print(c+" ");
		}
		
	}

}
