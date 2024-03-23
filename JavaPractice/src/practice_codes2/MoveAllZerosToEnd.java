package practice_codes2;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,0,0,3,0,4,0,5,0,6,7,8,0,9};
		int b[] = new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]!=0)
			{
				b[j]=a[i];
				j++;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==0)
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
