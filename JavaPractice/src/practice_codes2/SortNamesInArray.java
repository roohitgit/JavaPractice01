package practice_codes2;

public class SortNamesInArray {

	public static void main(String[] args) {
		
		
		String arr[] = {"elephant","dog","cat", "ball", "apple"}; 
		String temp;
		System.out.println(arr.length);
		for(int i=0;i<=arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(" "+arr[i]);
		}

	}

}
