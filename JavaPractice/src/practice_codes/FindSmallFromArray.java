package practice_codes;

public class FindSmallFromArray {

	public static void main(String[] args) {
		
		int a[] = {8,5,8,4,2,1,9};
		int small = a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<small)
				{
					small=a[j];
				}
			}
		}
		
		System.out.println("The Smallest Number in array is "+ small);

	}
}