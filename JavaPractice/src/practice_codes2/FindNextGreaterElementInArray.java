package practice_codes2;

public class FindNextGreaterElementInArray {

	public static void main(String[] args) {
		
		int ar[] = {11,21,13,14};
		
		for(int i=0;i<ar.length;i++)
		{int next=-1;
			for(int j=i+1;j<ar.length;j++)
			{
				
				if (ar[i]<ar[j])
					next=ar[j];
				break;
			}
			System.out.println(ar[i]+" next's "+next);
		}
			
	}

}
