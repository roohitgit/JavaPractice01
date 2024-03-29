package practice_codes2;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {9,8,7,5,6};
		System.out.println("Before sorting elements are ");
		for (int aa:a)
		{
			System.out.print(aa+" ");
		}
		
		bubbleSort(a);

	}
	
	private static void bubbleSort(int a[])
	{
		int temp = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<=(a.length-1);j++)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After sorting elements are ");
		for(int aa:a)
		{
			System.out.print(aa+" ");
		}
	}

}
