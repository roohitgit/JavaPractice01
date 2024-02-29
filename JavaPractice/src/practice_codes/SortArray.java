package practice_codes;
import java.util.Scanner;
public class SortArray {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of the array you want- ");
			int n = sc.nextInt();
			int a[] = new int[n];
			System.out.println("Enter the "+n+" elements for an array-");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int temp ;
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;		
						
					}
				}
				
			}
			System.out.println("Sorted array is");
			for(int k=0;k<a.length;k++)
			{
				System.out.print(a[k]+" ");
			}
		}

	}

}
