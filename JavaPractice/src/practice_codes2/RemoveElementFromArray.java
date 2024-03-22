package practice_codes2;

import java.util.Scanner;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		
		System.out.println("Enter the no of elements should be present in the array - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int loc = 0;
		System.out.println("Enter "+n+" elements ");
		int a[] = new int[n];
		for (int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.print("This is your array with all elements- ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("Enter a element which you want to delete from above list-");
		int element = sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				loc = i; 
				break;
			}
		}
		for(int i=0;i<a.length-1;i++)
		{
			
			if (i==loc)
			{
				a[i]=a[i+1];
			}
		
			else if (i>loc)
			{
				a[i]=a[i+1];
			}
			
			
		}
		
		for (int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
